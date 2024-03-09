package com.blankzhu.v1.intercept;

import com.blankzhu.v1.authorization.AuthorizationGenerator;
import com.blankzhu.v1.hash.Sha256HexGenerator;
import com.blankzhu.v1.signature.CtHmacSha256Signer;
import feign.RequestInterceptor;
import feign.RequestTemplate;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.time.Instant;

import static com.blankzhu.v1.common.VaasPublicParamConstants.*;

public class VaasHeaderInterceptor implements RequestInterceptor {
    private final String accessKey;
    private final String secretAccessKey;
    private final String vaasApiHost;

    public VaasHeaderInterceptor(String accessKey,
                                 String secretAccessKey,
                                 String vaasApiHost
    ) {
        this.accessKey = accessKey;
        this.secretAccessKey = secretAccessKey;
        this.vaasApiHost = vaasApiHost;
    }

    @Override
    public void apply(RequestTemplate requestTemplate) {
        try {
            setHeaders(requestTemplate);
        } catch (NoSuchAlgorithmException | InvalidKeyException e) {
            throw new RuntimeException(e);
        }
    }

    private void setHeaders(RequestTemplate requestTemplate) throws NoSuchAlgorithmException, InvalidKeyException {
//        String timestamp = String.valueOf((System.currentTimeMillis() / 100));
        String timestamp = String.valueOf(Instant.now().getEpochSecond());
        String httpRequestMethod = requestTemplate.method().toUpperCase();
        String canonicalURI = CT_VAAS_CANONICAL_URI;
        String canonicalQueryString = requestTemplate.queryLine();
        String canonicalHeaders = String.format("%s:%s\n%s:%s\n%s:%s\n",
                CONTENT_TYPE_HEADER.toLowerCase(), CONTENT_TYPE_VALUE.toLowerCase(),
                HOST_HEADER.toLowerCase(), vaasApiHost.toLowerCase(),
                TIMESTAMP_HEADER.toLowerCase(), timestamp
        );
        String signedHeaders = String.format("%s;%s;%s", CONTENT_TYPE_HEADER.toLowerCase(), HOST_HEADER.toLowerCase(), TIMESTAMP_HEADER.toLowerCase());
        String hashedRequestPayload = Sha256HexGenerator.generate(requestTemplate.body());

        String signature = CtHmacSha256Signer.sign(secretAccessKey,
                httpRequestMethod,
                canonicalURI,
                canonicalQueryString,
                canonicalHeaders,
                signedHeaders,
                hashedRequestPayload,
                timestamp);
        String authorization = AuthorizationGenerator.generate(accessKey, signedHeaders, signature, timestamp);

        requestTemplate.header(AUTHORIZATION_HEADER, authorization);
        requestTemplate.header(CONTENT_TYPE_HEADER, CONTENT_TYPE_VALUE);
        requestTemplate.header(HOST_HEADER, vaasApiHost);
        requestTemplate.header(VERSION_HEADER, VERSION_VALUE);
        requestTemplate.header(TIMESTAMP_HEADER, timestamp);
    }
}

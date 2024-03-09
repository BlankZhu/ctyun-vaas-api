package com.blankzhu.v1.signature;

import com.blankzhu.v1.hash.Sha256HexGenerator;
import org.apache.commons.codec.binary.Hex;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import static com.blankzhu.v1.common.VaasPublicParamConstants.*;

/**
 * CT-HMAC-SHA256 singer
 */
public class CtHmacSha256Signer {
    /**
     * get request signature
     *
     * @param secretAccessKey      API SK
     * @param httpRequestMethod    http request, all in upper case
     * @param canonicalURI         URI, should always be '/'
     * @param canonicalQueryString for POST, should be empty string; in other case, should do URLEncode in UTF8
     * @param canonicalHeaders     should contain at least 'content-type', 'host' & 'timestamp'; key and value here should be in lower case and concat by 'KEY1:VALUE1\nKEY2:VALUE2\n...' format, and should also be sorted by key asc order(also in lower case)
     * @param signedHeaders        identify what headers are include in signing (in canonicalHeaders), also in lower case and asc order and joined by ';'
     * @param hashedRequestPayload Lowercase(HexEncode(Hash.SHA256(RequestPayload)))
     * @param timestamp            timestamp value in header in MS
     * @return CT-HMAC-SHA256 signature
     */
    static public String sign(String secretAccessKey,
                              String httpRequestMethod,
                              String canonicalURI,
                              String canonicalQueryString,
                              String canonicalHeaders,
                              String signedHeaders,
                              String hashedRequestPayload,
                              String timestamp) throws NoSuchAlgorithmException, InvalidKeyException {
        String canonicalRequest = String.format("%s\n%s\n%s\n%s\n%s\n%s", httpRequestMethod, canonicalURI,
                canonicalQueryString, canonicalHeaders, signedHeaders, hashedRequestPayload);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(YEAR_MONTH_DATE_FORMAT);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String date = simpleDateFormat.format(new Date(Long.parseLong(timestamp + "000")));
        String credentialScope = String.format("%s/%s", date, CT_VAAS_PRODUCT_NAME);
        String hashedCanonicalRequest = Sha256HexGenerator.generate(canonicalRequest.getBytes(StandardCharsets.UTF_8));

        String stringToSign = String.format("%s\n%s\n%s\n%s", CT_VAAS_SIGN_ALGORITHM, timestamp, credentialScope, hashedCanonicalRequest);
        byte[] secretDate = hmac256(("CT" + secretAccessKey).getBytes(StandardCharsets.UTF_8), date);
        byte[] signingKey = hmac256(secretDate, CT_VAAS_PRODUCT_NAME);
        return Hex.encodeHexString(hmac256(signingKey, stringToSign)).toLowerCase();
    }

    static private byte[] hmac256(byte[] key, String message) throws NoSuchAlgorithmException, InvalidKeyException {
        Mac mac = Mac.getInstance("HmacSHA256");
        SecretKeySpec secretKeySpec = new SecretKeySpec(key, mac.getAlgorithm());
        mac.init(secretKeySpec);
        return mac.doFinal(message.getBytes(StandardCharsets.UTF_8));
    }
}

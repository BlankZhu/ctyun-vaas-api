package com.blankzhu.v1.signature;

import com.blankzhu.v1.hash.Sha256HexGenerator;
import org.junit.jupiter.api.Test;

import java.nio.charset.StandardCharsets;

public class CtHmacSha256SignerTest {

    @Test
    public void signatureTest() {
        try {
            String timestamp = "1645679518";
            String ak = "8FR8VXACHFFQIT33EKJI";
            String sk = "PwbZMn5wEqXVrjt3L6QSdxYyOvllrfLPzLcR1oh8";
            String httpRequestMethod = "POST";
            String canonicalUri = "/";
            String canonicalQueryString = "";
            String canonicalHeaders = "content-type:application/json; charset=utf-8\nhost:vaasapi.ctyun.cn\ntimestamp:1645679518\n";
            String signedHeaders = "content-type;host;timestamp";
            String requestPayload = "{\"RegionCode\": \"52000001\", \"InProtocol\": \"gb28181\",\"DeviceId\": \"32387732995\", \"DeviceCode\": \"35010200\", \"GbVersion\": \"2016\", \"DeviceVendor\": \"\\u6d77\\u5eb7\", \"DeviceName\": \"xxx\\u8def\\u53e3\\u6444\\u50cf\\u5934\", \"Description\": \"xxx\\u8def\\u53e3\\u6444\\u50cf\\u5934\", \"StreamSize\": 2, \"RecordTemplateId\": \"1000\"}";
            String hashedRequestPayload = Sha256HexGenerator.generate(requestPayload.getBytes(StandardCharsets.UTF_8));

            String correctSignature = "f7dcb4b6874698765c569f281e119388690b1af68ef3ed69deb4959d80ad4190";
            String signature = CtHmacSha256Signer.sign(sk, httpRequestMethod, canonicalUri, canonicalQueryString, canonicalHeaders, signedHeaders, hashedRequestPayload, timestamp);

            assert signature.equals(correctSignature);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

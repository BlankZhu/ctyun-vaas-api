package com.blankzhu.v1.authorization;

import org.junit.jupiter.api.Test;

public class AuthorizationGeneratorTest {
    @Test
    public void concatTest() {
        String correctAuthorization = "CT-HMAC-SHA256 Credential=8FR8VXACHFFQIT33EKJI/2022-02-24/vaas, SignedHeaders=content-type;host;timestamp, Signature=f7dcb4b6874698765c569f281e119388690b1af68ef3ed69deb4959d80ad4190";
        String accessKey = "8FR8VXACHFFQIT33EKJI";
        String signedHeaders = "content-type;host;timestamp";
        String signature = "f7dcb4b6874698765c569f281e119388690b1af68ef3ed69deb4959d80ad4190";
        String timestamp = "1645679518";

        String generatedAuthorization = AuthorizationGenerator.generate(accessKey, signedHeaders, signature, timestamp);

        assert generatedAuthorization.equals(correctAuthorization);
    }
}

package com.blankzhu.v1.hash;

import org.junit.jupiter.api.Test;

import java.nio.charset.StandardCharsets;

public class Sha256HexGeneratorTest {
    @Test
    public void hashTest() {
        String requestPayload = "{\"RegionCode\": \"52000001\", \"InProtocol\": \"gb28181\",\"DeviceId\": \"32387732995\", \"DeviceCode\": \"35010200\", \"GbVersion\": \"2016\", \"DeviceVendor\": \"\\u6d77\\u5eb7\", \"DeviceName\": \"xxx\\u8def\\u53e3\\u6444\\u50cf\\u5934\", \"Description\": \"xxx\\u8def\\u53e3\\u6444\\u50cf\\u5934\", \"StreamSize\": 2, \"RecordTemplateId\": \"1000\"}";
        String hashedRequestPayload = "e17c73972627979d074970ae454473a0d06aba5f193643e4b06769dda27862d5";

        try {
            String generatedSignature = Sha256HexGenerator.generate(requestPayload.getBytes(StandardCharsets.UTF_8));
            assert generatedSignature.equals(hashedRequestPayload);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package com.blankzhu.v1.entity.device.gb.connectivity.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class DevicePushInfo {
    @JsonProperty(value = "DeviceId")
    private String deviceId;
    @JsonProperty(value = "TransType")
    private String transType;
    @JsonProperty(value = "TransIP")
    private String transIP;
    @JsonProperty(value = "TransPort")
    private Long transPort;
    @JsonProperty(value = "SSRC")
    private String SSRC;
    private Long SSRCExpireTime;
    @JsonProperty(value = "CreatedTime")
    private String createdTime;
}

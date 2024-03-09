package com.blankzhu.v1.entity.device.talk.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Device {
    @JsonProperty(value = "DeviceId")
    private String deviceId;
    @JsonProperty(value = "DeviceVendor")
    private String deviceVendor;
    @JsonProperty(value = "AudioStatus")
    private String audioStatus;
    @JsonProperty(value = "TransType")
    private String transType;
    @JsonProperty(value = "TransIP")
    private String transIP;
    @JsonProperty(value = "TransPort")
    private Long transPort;
    @JsonProperty(value = "SSRC")
    private String SSRC;
    @JsonProperty(value = "ResetStatus")
    private String resetStatus;
    @JsonProperty(value = "NoneSSRC")
    private String noneSSRC;
    @JsonProperty(value = "CloudSSRC")
    private String cloudSSRC;
    @JsonProperty(value = "DeviceSSRC")
    private String deviceSSRC;
}

package com.blankzhu.v1.entity.device.gb.connectivity.reset;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ResetDeviceSSRCRequest {
    @JsonProperty(value = "DeviceId")
    private String deviceId;
    @JsonProperty(value = "CloudSSRC")
    private String cloudSSRC;
    @JsonProperty(value = "DeviceSSRC")
    private String deviceSSRC;
    @JsonProperty(value = "Expires")
    private Long expires;
}

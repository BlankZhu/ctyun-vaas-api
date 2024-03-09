package com.blankzhu.v1.entity.device.talk;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class DescribeDeviceTalkRequest {
    @JsonProperty(value = "SessionId")
    private String sessionId;
    @JsonProperty(value = "DeviceIds")
    private String deviceIds;
}

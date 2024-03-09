package com.blankzhu.v1.entity.device.talk;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class DeleteDeviceTalkRequest {
    @JsonProperty(value = "SessionId")
    private String sessionId;
    @JsonProperty(value = "DeviceIds")
    private List<String> deviceIds;
}

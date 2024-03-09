package com.blankzhu.v1.entity.device.talk;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class StopDeviceTalkRequest {
    @JsonProperty(value = "SessionId")
    private String sessionId;
}

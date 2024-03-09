package com.blankzhu.v1.entity.device.gb.cascade;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ControlCascadePlaybackRequest {
    @JsonProperty(value = "DeviceId")
    private String deviceId;
    @JsonProperty(value = "SSRC")
    private String SSRC;
    @JsonProperty(value = "Method")
    private String method;
    @JsonProperty(value = "Scale")
    private Double scale;
    @JsonProperty(value = "Range")
    private String range;
}

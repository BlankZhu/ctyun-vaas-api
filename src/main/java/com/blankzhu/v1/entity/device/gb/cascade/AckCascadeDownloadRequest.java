package com.blankzhu.v1.entity.device.gb.cascade;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class AckCascadeDownloadRequest {
    @JsonProperty(value = "DeviceId")
    private String deviceId;
    @JsonProperty(value = "SSRC")
    private String SSRC;
}

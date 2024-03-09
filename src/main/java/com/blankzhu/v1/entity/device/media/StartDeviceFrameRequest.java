package com.blankzhu.v1.entity.device.media;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class StartDeviceFrameRequest {
    @JsonProperty(value = "DeviceId")
    private String deviceId;
    @JsonProperty(value = "StreamNum")
    private Long streamNum;
    @JsonProperty(value = "FrameType")
    private Long frameType;
    @JsonProperty(value = "FrameInterval")
    private Long frameInterval;
    @JsonProperty(value = "StorageTime")
    private Long storageTime;
    @JsonProperty(value = "Extend")
    private String extend;
}

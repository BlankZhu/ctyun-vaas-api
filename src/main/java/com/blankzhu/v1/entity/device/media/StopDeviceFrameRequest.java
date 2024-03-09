package com.blankzhu.v1.entity.device.media;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class StopDeviceFrameRequest {
    @JsonProperty(value = "DeviceId")
    private String deviceId;
    @JsonProperty(value = "TaskId")
    private String taskId;
    @JsonProperty(value = "StreamNum")
    private Long streamNum;
}

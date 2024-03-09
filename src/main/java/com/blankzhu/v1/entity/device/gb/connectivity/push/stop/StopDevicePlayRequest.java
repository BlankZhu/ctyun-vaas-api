package com.blankzhu.v1.entity.device.gb.connectivity.push.stop;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class StopDevicePlayRequest {
    @JsonProperty(value = "DeviceId")
    private String deviceId;
    @JsonProperty(value = "StreamNum")
    private Long streamNum;
}

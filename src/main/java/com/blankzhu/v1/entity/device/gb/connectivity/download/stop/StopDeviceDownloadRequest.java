package com.blankzhu.v1.entity.device.gb.connectivity.download.stop;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class StopDeviceDownloadRequest {
    @JsonProperty(value = "DeviceId")
    private String deviceId;
    @JsonProperty(value = "SSRC")
    private String SSRC;
}

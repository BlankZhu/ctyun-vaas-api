package com.blankzhu.v1.entity.device.connectivity.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Device {
    @JsonProperty(value = "DeviceId")
    private String deviceId;
    @JsonProperty(value = "StreamNum")
    private Long streamNum;
    @JsonProperty(value = "PullUrl")
    private String pullUrl;
    @JsonProperty(value = "RecordTemplateId")
    private String recordTemplateId;
}

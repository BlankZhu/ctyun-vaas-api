package com.blankzhu.v1.entity.device.gb.connectivity.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Device {
    @JsonProperty(value = "DeviceId")
    private String deviceId;
    @JsonProperty(value = "StreamNum")
    private Long streamNum;
    @JsonProperty(value = "TransType")
    private String transType;
    private String SSRC;
    @JsonProperty(value = "NoneSSRC")
    private String noneSSRC;
    @JsonProperty(value = "StartTime")
    private Long startTime;
    @JsonProperty(value = "EndTime")
    private Long endTime;
    @JsonProperty(value = "RecordTemplateId")
    private String recordTemplateId;
}

package com.blankzhu.v1.entity.device.gb.connectivity.download.start;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class StartDeviceDownloadRequest {
    @JsonProperty(value = "SrcRegionCode")
    private String srcRegionCode;
    @JsonProperty(value = "DestRegionCode")
    private String destRegionCode;
    @JsonProperty(value = "InProtocol")
    private String inProtocol;
    @JsonProperty(value = "InNetwork")
    private String inNetwork;
    @JsonProperty(value = "DeviceId")
    private String deviceId;
    @JsonProperty(value = "TransType")
    private String transType;
    @JsonProperty(value = "NoneSSRC")
    private String noneSSRC;
    @JsonProperty(value = "StartTime")
    private Long startTime;
    @JsonProperty(value = "EndTime")
    private Long endTime;
    @JsonProperty(value = "StorageTime")
    private Long storageTime;
    @JsonProperty(value = "Expires")
    private Long expires;
}

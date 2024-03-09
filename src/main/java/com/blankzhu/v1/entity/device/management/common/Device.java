package com.blankzhu.v1.entity.device.management.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * <a href="https://vaas.ctyun.cn/document/vaas/api/API/VideoDevice/Device/CreateDevices">see more</a>
 */

@Data
public class Device {
    @JsonProperty(value = "RegionCode")
    private String regionCode;

    @JsonProperty(value = "InProtocol")
    private String inProtocol;

    @JsonProperty(value = "DeviceId")
    private String deviceId;

    @JsonProperty(value = "DeviceCode")
    private String deviceCode;

    @JsonProperty(value = "DeviceVendor")
    private String deviceVendor;

    @JsonProperty(value = "DeviceName")
    private String deviceName;

    @JsonProperty(value = "Description")
    private String description;

    @JsonProperty(value = "GbVersion")
    private String gbVersion;

    @JsonProperty(value = "PlatformId")
    private String platformId;

    @JsonProperty(value = "StreamSize")
    private Long streamSize;

    @JsonProperty(value = "LiveStreams")
    private List<LiveStream> liveStreams;

    @JsonProperty(value = "VodStreams")
    private List<VodStream> vodStreams;

    @JsonProperty(value = "RecordTemplateId")
    private String recordTemplateId;
}

package com.blankzhu.v1.entity.device.management.describe;

import com.blankzhu.v1.common.VaasApiResultBase;
import com.blankzhu.v1.entity.device.management.common.Metrics;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <a href="https://vcn.ctyun.cn/document/vaas/api/API/VideoDevice/Device/DescribeDevice">see more</a>
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class DescribeDeviceResult extends VaasApiResultBase {
    @JsonProperty(value = "DeviceId")
    private String deviceId;

    @JsonProperty(value = "DeviceCode")
    private String deviceCode;

    @JsonProperty(value = "RegionCode")
    private String regionCode;

    @JsonProperty(value = "InNetwork")
    private String inNetwork;

    @JsonProperty(value = "InProtocol")
    private String inProtocol;

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

    @JsonProperty(value = "RecordTemplateId")
    private String recordTemplateId;

    @JsonProperty(value = "CreatedTime")
    private String createdTime;

    @JsonProperty(value = "metrics")
    private Metrics metrics;
}

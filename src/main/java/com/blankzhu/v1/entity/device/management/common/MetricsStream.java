package com.blankzhu.v1.entity.device.management.common;

import com.blankzhu.v1.common.VaasApiResultBase;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <a href="https://vcn.ctyun.cn/document/vaas/api/API/VideoDevice/Device/DescribeDevice">see more</a>
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class MetricsStream extends VaasApiResultBase {
    @JsonProperty(value = "SSRC")
    private String SSRC;
    @JsonProperty(value = "IsSSRCValid")
    private String isSSRCValid;
    @JsonProperty(value = "Url")
    private String url;
    @JsonProperty(value = "StreamStatus")
    private String streamStatus;
    @JsonProperty(value = "TransType")
    private String transType;
    @JsonProperty(value = "DeviceTransIP")
    private String deviceTransIP;
    @JsonProperty(value = "DeviceTransPort")
    private Long deviceTransPort;
    @JsonProperty(value = "TransIP")
    private Long transIP;
    @JsonProperty(value = "TransPort")
    private Long transPort;
    @JsonProperty(value = "Audio")
    private StreamAudio audio;
    @JsonProperty(value = "Video")
    private StreamVideo video;
}

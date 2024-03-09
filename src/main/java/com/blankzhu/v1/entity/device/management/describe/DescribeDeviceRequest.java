package com.blankzhu.v1.entity.device.management.describe;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * <a href="https://vcn.ctyun.cn/document/vaas/api/API/VideoDevice/Device/DescribeDevice">see more</a>
 */
@Data
public class DescribeDeviceRequest {
    @JsonProperty(value = "DeviceId")
    private String deviceId;

    @JsonProperty(value = "SSRC")
    private String SSRC;

    @JsonProperty(value = "Metrics")
    private List<String> metrics;
}

package com.blankzhu.v1.entity.device.management.describe;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * <a href="https://vaas.ctyun.cn/document/vaas/api/API/VideoDevice/Device/DescribeDeviceStatus">see more</a>
 */
@Data
public class DescribeDeviceStatusRequest {
    @JsonProperty(value = "deviceId")
    private String deviceId;
}

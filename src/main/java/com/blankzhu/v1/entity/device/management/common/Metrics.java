package com.blankzhu.v1.entity.device.management.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * <a href="https://vcn.ctyun.cn/document/vaas/api/API/VideoDevice/Device/DescribeDevice">see more</a>
 */
@Data
public class Metrics {
    @JsonProperty(value = "Stream")
    private List<MetricsStream> stream;
    @JsonProperty(value = "Storage")
    private List<MetricsStorage> storage;
}

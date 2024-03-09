package com.blankzhu.v1.entity.resource;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class DescribeStoreRegionResultMetrics {
    @JsonProperty(value = "Device")
    private DescribeStoreRegionResultMetricsDevice device;
    @JsonProperty(value = "Storage")
    private DescribeStoreRegionResultMetricsStorage storage;
    @JsonProperty(value = "Network")
    private DescribeStoreRegionResultMetricsNetwork network;
}

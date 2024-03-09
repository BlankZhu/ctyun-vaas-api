package com.blankzhu.v1.entity.resource;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DescribeStoreRegionResultMetricsDevice {
    @JsonProperty(value = "TotalDevice")
    private Long totalDevice;
    @JsonProperty(value = "OnlineDevice")
    private Long onlineDevice;
    @JsonProperty(value = "RecordingDevice")
    private Long recordingDevice;
    @JsonProperty(value = "RecordingSuccessRate")
    private Double recordingSuccessRate;
    @JsonProperty(value = "GbDevice")
    private DescribeStoreRegionResultMetricsDeviceGbDevice gbDevice;
    @JsonProperty(value = "NonGbDevice")
    private DescribeStoreRegionResultMetricsDeviceGbDevice nonGbDevice;
}

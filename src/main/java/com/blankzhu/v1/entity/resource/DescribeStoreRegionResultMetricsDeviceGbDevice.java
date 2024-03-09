package com.blankzhu.v1.entity.resource;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class DescribeStoreRegionResultMetricsDeviceGbDevice {
    @JsonProperty(value = "TotalDevice")
    private Long totalDevice;
    @JsonProperty(value = "OnlineDevice")
    private Long onlineDevice;
    @JsonProperty(value = "RecordingDevice")
    private Long recordingDevice;
    @JsonProperty(value = "RecordingSuccessRate")
    private Double recordingSuccessRate;
}

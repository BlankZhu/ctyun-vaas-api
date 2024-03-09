package com.blankzhu.v1.entity.resource;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class DescribeStoreRegionResultMetricsNetwork {
    @JsonProperty(value = "InNetworks")
    private List<String> inNetworks;
    @JsonProperty(value = "BwInUsage")
    private Long bwInUsage;
    @JsonProperty(value = "BwOutUsage")
    private Long bwOutUsage;
    @JsonProperty(value = "BwInAvailable")
    private Long bwInAvailable;
    @JsonProperty(value = "BwOutAvailable")
    private Long bwOutAvailable;
}

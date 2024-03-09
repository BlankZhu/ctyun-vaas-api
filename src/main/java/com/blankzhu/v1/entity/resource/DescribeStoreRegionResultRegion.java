package com.blankzhu.v1.entity.resource;

import com.blankzhu.v1.common.VaasApiResultBase;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class DescribeStoreRegionResultRegion extends VaasApiResultBase {
    @JsonProperty(value = "RegionCode")
    private String regionCode;
    @JsonProperty(value = "RegionName")
    private String regionName;
    @JsonProperty(value = "RegionStatus")
    private String regionStatus;
    @JsonProperty(value = "MeasurementIP")
    private String measurementIP;
    @JsonProperty(value = "MeasurementPort")
    private Long measurementPort;
    @JsonProperty(value = "Metrics")
    private DescribeStoreRegionResultMetrics metrics;
}

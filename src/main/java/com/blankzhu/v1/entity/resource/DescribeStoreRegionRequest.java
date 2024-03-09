package com.blankzhu.v1.entity.resource;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * <a href="https://vcn.ctyun.cn/document/vaas/api/API/Region/DescribeStoreRegion">see more</a>
 */
@Data
public class DescribeStoreRegionRequest {
    @JsonProperty(value = "RegionCode")
    private String regionCode;


    @JsonProperty(value = "Metrics")
    private List<String> metrics;
}

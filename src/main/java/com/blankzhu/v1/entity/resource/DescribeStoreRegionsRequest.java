package com.blankzhu.v1.entity.resource;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * <a href="https://vcn.ctyun.cn/document/vaas/api/API/Region/DescribeStoreRegions">see more</a>
 */

@Data
public class DescribeStoreRegionsRequest {

    @JsonProperty(value = "Metrics")
    private List<String> metrics;
}

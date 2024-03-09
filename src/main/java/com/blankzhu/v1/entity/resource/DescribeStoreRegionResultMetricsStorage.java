package com.blankzhu.v1.entity.resource;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class DescribeStoreRegionResultMetricsStorage {
    @JsonProperty(value = "S3Usage")
    private Long s3Usage;
    @JsonProperty(value = "S3Available")
    private Long s3Available;
}

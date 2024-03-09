package com.blankzhu.v1.entity.device.stream;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class DescribeOnlineStreamsRequest {
    @JsonProperty(value = "DeviceTransIP")
    private String deviceTransIP;
    @JsonProperty(value = "Metrics")
    private List<String> metrics;
    @JsonProperty(value = "SortBy")
    private String sortBy;
    @JsonProperty(value = "SortDirection")
    private String sortDirection;
    @JsonProperty(value = "PageNum")
    private Long pageNum;
    @JsonProperty(value = "PageSize")
    private Long pageSize;
}

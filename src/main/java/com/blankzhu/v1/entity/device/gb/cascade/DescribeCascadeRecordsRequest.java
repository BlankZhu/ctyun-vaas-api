package com.blankzhu.v1.entity.device.gb.cascade;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class DescribeCascadeRecordsRequest {
    @JsonProperty(value = "DeviceId")
    private String deviceId;
    @JsonProperty(value = "StartTime")
    private String startTime;
    @JsonProperty(value = "EndTime")
    private String endTime;
    @JsonProperty(value = "SortBy")
    private String sortBy;
    @JsonProperty(value = "SortDirection")
    private String sortDirection;
    @JsonProperty(value = "PageNum")
    private Long pageNum;
    @JsonProperty(value = "PageSize")
    private Long pageSize;
}

package com.blankzhu.v1.entity.device.management.describe;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * <a href="https://vaas.ctyun.cn/document/vaas/api/API/VideoDevice/Device/DescribeDeviceStatusList">see more</a>
 */
@Data
public class DescribeDeviceStatusListRequest {
    @JsonProperty(value = "DeviceIds")
    private List<String> deviceIds;


    @JsonProperty(value = "RegionCode")
    private String regionCode;


    @JsonProperty(value = "StreamStatus")
    private String streamStatus;


    @JsonProperty(value = "RecordStatus")
    private String recordStatus;


    @JsonProperty(value = "SortBy")
    private String sortBy;


    @JsonProperty(value = "SortDirection")
    private String sortDirection;


    @JsonProperty(value = "PageNum")
    private Long pageNum;


    @JsonProperty(value = "PageSize")
    private Long pageSize;
}

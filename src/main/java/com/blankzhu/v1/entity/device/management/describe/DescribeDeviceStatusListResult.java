package com.blankzhu.v1.entity.device.management.describe;

import com.blankzhu.v1.common.VaasApiResultBase;
import com.blankzhu.v1.entity.device.management.common.Device;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class DescribeDeviceStatusListResult extends VaasApiResultBase {
    @JsonProperty(value = "PageNum")
    private Long pageNum;
    @JsonProperty(value = "PageSize")
    private Long pageSize;
    @JsonProperty(value = "TotalPage")
    private Long totalPage;
    @JsonProperty(value = "TotalNum")
    private Long totalNum;
    @JsonProperty(value = "Devices")
    private List<Device> devices;
}

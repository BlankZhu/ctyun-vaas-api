package com.blankzhu.v1.entity.device.stream;

import com.blankzhu.v1.common.VaasApiResultBase;
import com.blankzhu.v1.entity.device.stream.common.Metrics;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class DescribeOnlineStreamsResult extends VaasApiResultBase {
    @JsonProperty(value = "PageNum")
    private Long pageNum;
    @JsonProperty(value = "PageSize")
    private Long pageSize;
    @JsonProperty(value = "TotalPage")
    private Long totalPage;
    @JsonProperty(value = "TotalNum")
    private Long totalNum;
    @JsonProperty(value = "StreamNum")
    private Long streamNum;
    @JsonProperty(value = "Metrics")
    private List<Metrics> metrics;
}

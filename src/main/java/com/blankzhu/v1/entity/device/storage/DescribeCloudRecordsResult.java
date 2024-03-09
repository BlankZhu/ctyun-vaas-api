package com.blankzhu.v1.entity.device.storage;

import com.blankzhu.v1.common.VaasApiResultBase;
import com.blankzhu.v1.entity.device.storage.common.Record;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class DescribeCloudRecordsResult extends VaasApiResultBase {
    @JsonProperty(value = "DeviceId")
    private String deviceId;
    @JsonProperty(value = "PageNum")
    private Long pageNum;
    @JsonProperty(value = "PageSize")
    private Long pageSize;
    @JsonProperty(value = "TotalPage")
    private Long totalPage;
    @JsonProperty(value = "TotalNum")
    private Long totalNum;
    @JsonProperty(value = "RecordType")
    private Long recordType;
    @JsonProperty(value = "Records")
    private List<Record> records;
}

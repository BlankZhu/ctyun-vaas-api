package com.blankzhu.v1.entity.device.stream;

import com.blankzhu.v1.common.VaasApiResultBase;
import com.blankzhu.v1.entity.device.stream.common.PlayUrl;
import com.blankzhu.v1.entity.device.stream.common.Record;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class DescribeCloudVodStreamResult extends VaasApiResultBase {
    @JsonProperty(value = "DeviceId")
    private String deviceId;
    @JsonProperty(value = "RecordType")
    private Long recordType;
    @JsonProperty(value = "Records")
    private List<Record> records;
    @JsonProperty(value = "PlayUrl")
    private PlayUrl playUrl;
}

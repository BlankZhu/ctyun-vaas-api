package com.blankzhu.v1.entity.device.stream;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class DescribeCloudVodStreamRequest {
    @JsonProperty(value = "DeviceId")
    private String deviceId;
    @JsonProperty(value = "OutNetwork")
    private String outNetwork;
    @JsonProperty(value = "OutProtocol")
    private String outProtocol;
    @JsonProperty(value = "RecordType")
    private Long recordType;
    @JsonProperty(value = "RecordId")
    private String recordId;
    @JsonProperty(value = "StartTime")
    private String startTime;
    @JsonProperty(value = "EndTime")
    private String endTime;
    @JsonProperty(value = "Expires")
    private Long expires;
}

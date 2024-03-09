package com.blankzhu.v1.entity.device.storage;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class DescribeLocalRecordRequest {
    @JsonProperty(value = "DeviceId")
    private String deviceId;
    @JsonProperty(value = "OutNetwork")
    private String outNetwork;
    @JsonProperty(value = "TaskId")
    private String taskId;
    @JsonProperty(value = "Expires")
    private Long expires;
}

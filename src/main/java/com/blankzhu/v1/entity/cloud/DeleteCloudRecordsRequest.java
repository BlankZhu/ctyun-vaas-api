package com.blankzhu.v1.entity.cloud;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class DeleteCloudRecordsRequest {
    @JsonProperty(value = "DeviceId")
    private String deviceId;
    @JsonProperty(value = "RecordIds")
    private List<String> recordIds;
}

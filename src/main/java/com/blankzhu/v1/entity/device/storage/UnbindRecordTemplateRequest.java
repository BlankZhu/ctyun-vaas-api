package com.blankzhu.v1.entity.device.storage;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class UnbindRecordTemplateRequest {
    @JsonProperty(value = "DeviceId")
    private String deviceId;
    @JsonProperty(value = "RecordTemplateId")
    private String recordTemplateId;
}

package com.blankzhu.v1.entity.device.storage.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class Bind {
    @JsonProperty(value = "DeviceIds")
    private List<String> deviceIds;
    @JsonProperty(value = "RecordTemplateId")
    private String recordTemplateId;
}

package com.blankzhu.v1.entity.device.management.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class MetricsStorage {
    @JsonProperty(value = "SSRC")
    private String SSRC;
    @JsonProperty(value = "RecordTemplateId")
    private String recordTemplateId;
    @JsonProperty(value = "RecordStatus")
    private String recordStatus;
    @JsonProperty(value = "RecordingSuccessRate")
    private Double recordingSuccessRate;
}

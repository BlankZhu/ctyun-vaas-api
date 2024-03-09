package com.blankzhu.v1.entity.device.media;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class StopLiveTranscodeRequest {
    @JsonProperty(value = "TaskId")
    private String taskId;
}

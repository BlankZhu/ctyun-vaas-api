package com.blankzhu.v1.entity.device.media.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Frame {
    @JsonProperty(value = "RecordId")
    private String recordId;
    @JsonProperty(value = "FrameUrl")
    private String frameUrl;
    @JsonProperty(value = "FrameTime")
    private String frameTime;
    @JsonProperty(value = "Extend")
    private String extend;
}

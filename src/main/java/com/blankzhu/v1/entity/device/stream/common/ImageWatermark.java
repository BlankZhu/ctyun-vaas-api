package com.blankzhu.v1.entity.device.stream.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ImageWatermark {
    @JsonProperty(value = "Content")
    private String content;
    @JsonProperty(value = "XPosition")
    private Long xPosition;
    @JsonProperty(value = "YPosition")
    private Long yPosition;
    @JsonProperty(value = "Width")
    private Long width;
    @JsonProperty(value = "Height")
    private Long height;
}

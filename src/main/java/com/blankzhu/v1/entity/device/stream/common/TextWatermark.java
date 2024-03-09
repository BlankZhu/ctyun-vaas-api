package com.blankzhu.v1.entity.device.stream.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TextWatermark {
    @JsonProperty(value = "Content")
    private String content;
    @JsonProperty(value = "XPosition")
    private Long xPosition;
    @JsonProperty(value = "YPosition")
    private Long yPosition;
    @JsonProperty(value = "Font")
    private String font;
    @JsonProperty(value = "Size")
    private Long size;
    @JsonProperty(value = "Color")
    private String color;
}

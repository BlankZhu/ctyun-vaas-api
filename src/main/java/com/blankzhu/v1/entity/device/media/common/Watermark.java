package com.blankzhu.v1.entity.device.media.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Watermark {
    @JsonProperty(value = "ImageWatermark")
    private ImageWatermark imageWatermark;
    @JsonProperty(value = "TextWatermark")
    private TextWatermark textWatermark;
}

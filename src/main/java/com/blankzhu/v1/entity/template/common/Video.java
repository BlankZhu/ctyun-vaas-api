package com.blankzhu.v1.entity.template.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Video {
    @JsonProperty(value = "Codec")
    private String codec;

    @JsonProperty(value = "FPS")
    private Long FPS;

    @JsonProperty(value = "GOP")
    private Long GOP;

    @JsonProperty(value = "Bitrate")
    private Long bitrate;

    @JsonProperty(value = "Width")
    private Long width;

    @JsonProperty(value = "Height")
    private Long height;

}

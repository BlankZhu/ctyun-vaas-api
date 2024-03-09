package com.blankzhu.v1.entity.device.stream.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Video {
    @JsonProperty(value = "Codec")
    private String codec;
    @JsonProperty(value = "Bitrate")
    private Long bitrate;
    @JsonProperty(value = "FPS")
    private Long FPS;
    @JsonProperty(value = "GOP")
    private Long GOP;
    @JsonProperty(value = "Lossrate")
    private Double lossrate;
}

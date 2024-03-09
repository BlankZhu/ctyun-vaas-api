package com.blankzhu.v1.entity.device.storage.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Video {
    @JsonProperty(value = "Codec")
    private String codec;
}

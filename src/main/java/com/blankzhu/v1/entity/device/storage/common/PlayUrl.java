package com.blankzhu.v1.entity.device.storage.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class PlayUrl {
    @JsonProperty(value = "HlsUrl")
    private String hlsUrl;
    @JsonProperty(value = "PsUrl")
    private String psUrl;
}

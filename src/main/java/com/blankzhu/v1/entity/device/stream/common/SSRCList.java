package com.blankzhu.v1.entity.device.stream.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class SSRCList {
    @JsonProperty(value = "SSRC")
    private String SSRC;
    @JsonProperty(value = "IsSSRCValid")
    private String isSSRCValid;
}

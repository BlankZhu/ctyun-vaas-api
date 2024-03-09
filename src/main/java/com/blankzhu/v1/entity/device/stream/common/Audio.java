package com.blankzhu.v1.entity.device.stream.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Audio {
    @JsonProperty(value = "Codec")
    private String codec;
    @JsonProperty(value = "SampleBit")
    private Long sampleBit;
    @JsonProperty(value = "SampleRate")
    private Long sampleRate;
}

package com.blankzhu.v1.entity.device.management.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * <a href="https://vcn.ctyun.cn/document/vaas/api/API/VideoDevice/Device/DescribeDevice">see more</a>
 */
@Data
public class StreamAudio {
    @JsonProperty(value = "Codec")
    private String codec;
    @JsonProperty(value = "SampleBit")
    private Long sampleBit;
    @JsonProperty(value = "SampleRate")
    private Long sampleRate;
}

package com.blankzhu.v1.entity.device.management.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * <a href="https://vcn.ctyun.cn/document/vaas/api/API/VideoDevice/Device/DescribeDevice">see more</a>
 */
@Data
public class StreamVideo {
    @JsonProperty(value = "Codec")
    private String codec;
    @JsonProperty(value = "FPS")
    private Long fPS;
    @JsonProperty(value = "GOP")
    private Long gOP;
    @JsonProperty(value = "Bitrate")
    private Long bitrate;
    @JsonProperty(value = "Lossrate")
    private Double lossrate;
}

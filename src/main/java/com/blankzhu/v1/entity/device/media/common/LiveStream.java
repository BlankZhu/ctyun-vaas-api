package com.blankzhu.v1.entity.device.media.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class LiveStream {
    @JsonProperty(value = "StreamNum")
    private Long streamNum;
    @JsonProperty(value = "StreamStatus")
    private String streamStatus;
    @JsonProperty(value = "ThumbnailUrl")
    private String thumbnailUrl;
}

package com.blankzhu.v1.entity.device.media;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class DescribeLiveThumbnailRequest {
    @JsonProperty(value = "DeviceId")
    private String deviceId;
    @JsonProperty(value = "OutNetwork")
    private String outNetwork;
    @JsonProperty(value = "StreamNum")
    private Long streamNum;
    @JsonProperty(value = "FileFormat")
    private String fileFormat;
    @JsonProperty(value = "Expires")
    private Long expires;
}

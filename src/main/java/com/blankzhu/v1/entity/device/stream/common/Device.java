package com.blankzhu.v1.entity.device.stream.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class Device {
    @JsonProperty(value = "DeviceId")
    private String deviceId;
    @JsonProperty(value = "SSRCList")
    private List<SSRCList> ssrcList;
    @JsonProperty(value = "UrlList")
    private List<String> urlList;
}

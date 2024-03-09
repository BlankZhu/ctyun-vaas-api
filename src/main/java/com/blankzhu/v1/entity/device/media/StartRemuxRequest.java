package com.blankzhu.v1.entity.device.media;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class StartRemuxRequest {
    @JsonProperty(value = "DeviceIds")
    private List<String> deviceIds;
    @JsonProperty(value = "OutProtocol")
    private String outProtocol;
}

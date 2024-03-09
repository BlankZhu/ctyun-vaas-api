package com.blankzhu.v1.entity.device.stream.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class Stream {
    @JsonProperty(value = "DeviceId")
    private String deviceId;
    @JsonProperty(value = "StreamList")
    private List<StreamList> streamList;
}

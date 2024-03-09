package com.blankzhu.v1.entity.device.stream.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class Metrics {
    @JsonProperty(value = "Device")
    private List<Device> device;
    @JsonProperty(value = "Stream")
    private List<Stream> stream;
}

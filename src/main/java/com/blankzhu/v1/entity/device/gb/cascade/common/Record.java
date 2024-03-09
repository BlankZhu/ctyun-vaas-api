package com.blankzhu.v1.entity.device.gb.cascade.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Record {
    @JsonProperty(value = "StartTime")
    private String startTime;
    @JsonProperty(value = "EndTime")
    private String endTime;
}

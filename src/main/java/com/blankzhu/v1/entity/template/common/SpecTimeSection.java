package com.blankzhu.v1.entity.template.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class SpecTimeSection {
    @JsonProperty(value = "StartTime")
    private String startTime;
    @JsonProperty(value = "EndTime")
    private String endTime;
}

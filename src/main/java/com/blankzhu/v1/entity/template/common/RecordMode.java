package com.blankzhu.v1.entity.template.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class RecordMode {
    @JsonProperty(value = "RecordType")
    private String recordType;


    @JsonProperty(value = "WeekTimeSections")
    private List<WeekTimeSection> weekTimeSections;


    @JsonProperty(value = "SpecTimeSections")
    private List<SpecTimeSection> specTimeSections;


    @JsonProperty(value = "PreRecordingTime")
    private Long preRecordingTime;


    @JsonProperty(value = "PostRecordingTime")
    private Long postRecordingTime;

    @JsonProperty(value = "StorageTime")
    private Long storageTime;
}

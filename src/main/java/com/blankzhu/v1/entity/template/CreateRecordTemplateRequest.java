package com.blankzhu.v1.entity.template;


import com.blankzhu.v1.entity.template.common.RecordMode;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * <a href="https://vcn.ctyun.cn/document/vaas/api/API/Template/CreateRecordTemplate">see more</a>
 */
@Data
public class CreateRecordTemplateRequest {
    @JsonProperty(value = "TemplateName")
    private String templateName;

    @JsonProperty(value = "Description")
    private String description;


    @JsonProperty(value = "Bitrate")
    private Long bitrate;


    @JsonProperty(value = "FileFormat")
    private String fileFormat;


    @JsonProperty(value = "FileDuration")
    private Long fileDuration;

    @JsonProperty(value = "createRecordTemplateRequestRecordModes")
    private List<RecordMode> createRecordTemplateRequestRecordModes;
}

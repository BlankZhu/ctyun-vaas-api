package com.blankzhu.v1.entity.template;

import com.blankzhu.v1.entity.template.common.Audio;
import com.blankzhu.v1.entity.template.common.Video;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateLiveTranscodeTemplateRequest {
    @JsonProperty(value = "TemplateName")
    private String templateName;

    @JsonProperty(value = "Description")
    private String description;

    @JsonProperty(value = "Video")
    private Video video;

    @JsonProperty(value = "Audio")
    private Audio audio;
}

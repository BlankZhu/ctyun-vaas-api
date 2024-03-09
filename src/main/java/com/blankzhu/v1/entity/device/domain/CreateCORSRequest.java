package com.blankzhu.v1.entity.device.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class CreateCORSRequest {
    @JsonProperty(value = "AllowedOrigins")
    private List<String> allowedOrigins;
}

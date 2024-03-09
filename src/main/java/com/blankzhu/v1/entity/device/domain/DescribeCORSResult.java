package com.blankzhu.v1.entity.device.domain;

import com.blankzhu.v1.common.VaasApiResultBase;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class DescribeCORSResult extends VaasApiResultBase {
    @JsonProperty(value = "AllowedOrigins")
    private List<String> allowedOrigins;
}

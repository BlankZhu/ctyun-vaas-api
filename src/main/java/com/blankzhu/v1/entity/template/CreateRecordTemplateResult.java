package com.blankzhu.v1.entity.template;

import com.blankzhu.v1.common.VaasApiResultBase;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <a href="https://vcn.ctyun.cn/document/vaas/api/API/Template/CreateRecordTemplate">see more</a>
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class CreateRecordTemplateResult extends VaasApiResultBase {
    @JsonProperty(value = "RecordTemplateId")
    private String recordTemplateId;
    @JsonProperty(value = "CreatedTime")
    private String createdTime;
    @JsonProperty(value = "UpdatedTime")
    private String updatedTime;
}

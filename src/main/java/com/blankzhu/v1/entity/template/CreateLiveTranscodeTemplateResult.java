package com.blankzhu.v1.entity.template;

import com.blankzhu.v1.common.VaasApiResultBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class CreateLiveTranscodeTemplateResult extends VaasApiResultBase {
    private String liveTranscodeTemplateId;
    private String createdTime;
    private String updatedTime;
}

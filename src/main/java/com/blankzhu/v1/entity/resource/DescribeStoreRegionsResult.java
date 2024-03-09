package com.blankzhu.v1.entity.resource;

import com.blankzhu.v1.common.VaasApiResultBase;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class DescribeStoreRegionsResult extends VaasApiResultBase {
    @JsonProperty(value = "Regions")
    private List<DescribeStoreRegionResultRegion> regions;
}

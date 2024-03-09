package com.blankzhu.v1.entity.device.management.create;

import com.blankzhu.v1.entity.device.management.common.Device;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <a href="https://vaas.ctyun.cn/document/vaas/api/API/VideoDevice/Device/CreateDevice">see more</a>
 */

@EqualsAndHashCode(callSuper = true)
@Data
public class CreateDeviceRequest extends Device {
}

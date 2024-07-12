package org.example.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author by shenjies88
 * @since 2024/6/11 14:38
 */
@Data
public class ColumnStandardApprovalLogPageDTO extends BasePageDTO {

    @ApiModelProperty("中文名称或者英文名称")
    private String name;

    @ApiModelProperty("状态，（待审批-1、审批通过-2、审批退回-3）")
    private Integer auditStatus;

    @ApiModelProperty("审批事项，（1表示发布，2表示回滚）")
    private Integer approvalType;

}

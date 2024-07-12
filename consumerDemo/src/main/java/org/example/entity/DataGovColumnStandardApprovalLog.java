package org.example.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 字段标准的审批记录
 * </p>
 *
 * @author heming
 * @since 2024-06-24
 */
@Getter
@Setter
@TableName("data_gov_column_standard_approval_log")
@ApiModel(value = "DataGovColumnStandardApprovalLog对象", description = "字段标准的审批记录")
public class DataGovColumnStandardApprovalLog extends MyBaseEntity {

    @ApiModelProperty("主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("字段标准的id")
    private Long columnStandardId;

    @ApiModelProperty("当前字段标准版本的id")
    private Long standardCurrentVersionId;

    @ApiModelProperty("回滚字段标准版本的id")
    private Long standardRollbackVersionId;

    @ApiModelProperty("审批事项，（1表示发布，2表示回滚）")
    private Integer approvalType;

    @ApiModelProperty("状态，（待审批-1、审批通过-2、审批退回-3）")
    private Integer auditStatus;

    @ApiModelProperty("审批说明")
    private String auditResult;

    @ApiModelProperty("申请原因")
    private String applicationReason;
}

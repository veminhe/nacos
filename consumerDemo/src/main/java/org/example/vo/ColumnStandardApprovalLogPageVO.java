package org.example.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author by heming
 * @since 2024/6/11 14:38
 */
@Data
public class ColumnStandardApprovalLogPageVO {

    @ApiModelProperty("主键")
    private Long id;

    @ApiModelProperty("中文名称")
    private String cnName;

    @ApiModelProperty("英文名称")
    private String enName;

    @ApiModelProperty("审批事项，（1表示发布，2表示回滚）")
    private Integer approvalType;

    @ApiModelProperty("申请人")
    private String createUser;

    @ApiModelProperty("状态，（待审批-1、审批通过-2、审批退回-3）")
    private Integer auditStatus;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty("申请时间")
    private LocalDateTime createTime;
}

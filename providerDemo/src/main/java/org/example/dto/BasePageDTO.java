package org.example.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author shenjies88
 * @since 2023/3/2/16:23
 */
@Data
@ApiModel("基础分页请求")
public class BasePageDTO {

    @ApiModelProperty("当前页")
    private long current = 1;

    @ApiModelProperty("分页数")
    private long size = 10;

}

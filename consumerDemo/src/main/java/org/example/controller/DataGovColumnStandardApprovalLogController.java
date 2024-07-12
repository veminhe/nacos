package org.example.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.dto.ColumnStandardApprovalLogPageDTO;
import org.example.service.IDataGovColumnStandardApprovalLogService;
import org.example.vo.ColumnStandardApprovalLogPageVO;
import org.example.vo.HttpResultVO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 字段标准的审批记录 前端控制器
 * </p>
 *
 * @author heming
 * @since 2024-06-24
 */
@Api(tags = "字段标准的审批记录的API")
@RestController
@RequestMapping("/data-gov-column-standard-approval-log")
@AllArgsConstructor
@Slf4j
public class DataGovColumnStandardApprovalLogController {
    private final IDataGovColumnStandardApprovalLogService dataGovColumnStandardApprovalLogService;

    @ApiOperation("分页")
    @PostMapping("/page")
    public HttpResultVO<Page<ColumnStandardApprovalLogPageVO>> page(@RequestBody ColumnStandardApprovalLogPageDTO pageDTO) {
        return HttpResultVO.success(dataGovColumnStandardApprovalLogService.myPage(pageDTO));
    }



}

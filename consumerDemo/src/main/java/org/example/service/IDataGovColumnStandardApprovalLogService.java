package org.example.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import org.example.dto.ColumnStandardApprovalLogPageDTO;
import org.example.entity.DataGovColumnStandardApprovalLog;
import org.example.vo.ColumnStandardApprovalLogPageVO;

/**
 * <p>
 * 字段标准的审批记录 服务类
 * </p>
 *
 * @author heming
 * @since 2024-06-24
 */
public interface IDataGovColumnStandardApprovalLogService extends IService<DataGovColumnStandardApprovalLog> {
    Page<ColumnStandardApprovalLogPageVO> myPage(ColumnStandardApprovalLogPageDTO pageDTO);
}

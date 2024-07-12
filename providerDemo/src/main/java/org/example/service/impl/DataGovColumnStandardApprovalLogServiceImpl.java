package org.example.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.AllArgsConstructor;
import org.example.dto.ColumnStandardApprovalLogPageDTO;
import org.example.entity.DataGovColumnStandardApprovalLog;
import org.example.mapper.DataGovColumnStandardApprovalLogMapper;
import org.example.service.IDataGovColumnStandardApprovalLogService;
import org.example.utils.PageUtil;
import org.example.vo.ColumnStandardApprovalLogPageVO;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 字段标准的审批记录 服务实现类
 * </p>
 *
 * @author heming
 * @since 2024-06-24
 */
@AllArgsConstructor
@Service
public class DataGovColumnStandardApprovalLogServiceImpl extends ServiceImpl<DataGovColumnStandardApprovalLogMapper, DataGovColumnStandardApprovalLog> implements IDataGovColumnStandardApprovalLogService {
    private final DataGovColumnStandardApprovalLogMapper dataGovColumnStandardApprovalLogMapper;
    /**
     * 分页查询
     */
    @Override
    public Page<ColumnStandardApprovalLogPageVO> myPage(ColumnStandardApprovalLogPageDTO pageDTO) {
        return PageUtil.getResult(pageDTO, dataGovColumnStandardApprovalLogMapper::myPage);
    }

}

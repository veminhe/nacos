package org.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.dto.BasePageDTO;
import org.example.entity.DataGovColumnStandardApprovalLog;
import org.example.vo.ColumnStandardApprovalLogPageVO;

/**
 * <p>
 * 字段标准的审批记录 Mapper 接口
 * </p>
 *
 * @author heming
 * @since 2024-06-24
 */
@Mapper
public interface DataGovColumnStandardApprovalLogMapper extends BaseMapper<DataGovColumnStandardApprovalLog> {
    Page<ColumnStandardApprovalLogPageVO> myPage(Page<ColumnStandardApprovalLogPageVO> columnStandardApprovalLogPageVO, @Param("pageDTO") BasePageDTO basePageDTO);

}

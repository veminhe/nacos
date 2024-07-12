package org.example.utils;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.example.dto.BasePageDTO;

/**
 * @author shenjies88
 * @since 2023/3/2/16:33
 */
public interface PageUtil {

    static <T> Page<T> getResult(BasePageDTO pageDTO, PageHandleFunction<T> pageHandle) {
        Page<T> page = new Page<>(pageDTO.getCurrent(), pageDTO.getSize());
        return pageHandle.get(page, pageDTO);
    }
}

package org.example.utils;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.example.dto.BasePageDTO;

/**
 * @author shenjies88
 * @since 2023/3/2/16:53
 */
@FunctionalInterface
public interface PageHandleFunction<T> {

    Page<T> get(Page<T> page, BasePageDTO pageDTO);
}

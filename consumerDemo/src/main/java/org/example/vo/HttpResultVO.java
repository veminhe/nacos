package org.example.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author shenjies88
 * @since 2023/3/2/9:17
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@ApiModel("http返回结果")
public class HttpResultVO<T> {

    @ApiModelProperty("状态码 200-成功")
    private int code;
    @ApiModelProperty("true-成功 false-失败")
    private boolean success;
    @ApiModelProperty("返回数据")
    private T data;
    @ApiModelProperty("错误信息")
    private String errorMsg;

    public static <T> HttpResultVO<T> success(T data) {
        return new HttpResultVO<>(200, true, data, null);
    }

    public static HttpResultVO<Void> success() {
        return new HttpResultVO<>(200, true, null, null);
    }

    public static HttpResultVO error(String errorMsg) {
        return new HttpResultVO<>(500, false, null, errorMsg);
    }

    public static HttpResultVO<Void> error(int code, String errorMsg) {
        return new HttpResultVO<>(code, false, null, errorMsg);
    }
}

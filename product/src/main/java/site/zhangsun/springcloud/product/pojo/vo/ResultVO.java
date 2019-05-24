package site.zhangsun.springcloud.product.pojo.vo;

import lombok.Data;

/**
 * Function:
 *
 * @author zhangsunjiankun - 2019/5/24 下午4:41
 */
@Data
public class ResultVO<T> {

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 提示信息
     */
    private String msg;

    /**
     * 具体内容
     */
    private T data;
}

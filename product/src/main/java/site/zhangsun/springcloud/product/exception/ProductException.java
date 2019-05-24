package site.zhangsun.springcloud.product.exception;

import site.zhangsun.springcloud.product.enums.ResultEnum;

/**
 * Function:
 *
 * @author zhangsunjiankun - 2019/5/24 下午4:52
 */
public class ProductException extends RuntimeException {

    private Integer code;

    public ProductException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public ProductException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
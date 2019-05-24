package site.zhangsun.springcloud.product.enums;

import lombok.Getter;

/**
 * Function:
 *
 * @author zhangsunjiankun - 2019/5/24 下午4:53
 */
@Getter
public enum ResultEnum {

    PRODUCT_NOT_EXIST(1, "商品不存在"),
    PRODUCT_STOCK_ERROR(2, "库存有误"),
    ;

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
package site.zhangsun.springcloud.product.enums;

import lombok.Getter;

/**
 * Function:
 *
 * @author zhangsunjiankun - 2019/5/24 下午4:53
 */
@Getter
public enum ProductStatusEnum {
    UP(0, "在架"),
    DOWN(1, "下架"),
    ;

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
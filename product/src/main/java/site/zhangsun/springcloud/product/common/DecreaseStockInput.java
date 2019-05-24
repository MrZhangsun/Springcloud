package site.zhangsun.springcloud.product.common;

import lombok.Data;

/**
 * Function:
 *
 * @author zhangsunjiankun - 2019/5/24 下午4:39
 */

@Data
public class DecreaseStockInput {

    private String productId;

    private Integer productQuantity;

    public DecreaseStockInput() {
    }

    public DecreaseStockInput(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
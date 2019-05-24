package site.zhangsun.springcloud.product.service;

import site.zhangsun.springcloud.product.common.DecreaseStockInput;
import site.zhangsun.springcloud.product.common.ProductInfoOutput;
import site.zhangsun.springcloud.product.pojo.entity.ProductInfo;

import java.util.List;

/**
 * Function:
 *
 * @author zhangsunjiankun - 2019/5/24 下午4:35
 */
public interface ProductService {

    /**
     * 查询所有在架商品列表
     */
    List<ProductInfo> findUpAll();

    /**
     * 查询商品列表
     * @param productIdList
     * @return
     */
    List<ProductInfoOutput> findList(List<String> productIdList);

    /**
     * 扣库存
     * @param decreaseStockInputList
     */
    void decreaseStock(List<DecreaseStockInput> decreaseStockInputList);
}

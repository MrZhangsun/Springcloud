package site.zhangsun.springcloud.product.service;

import site.zhangsun.springcloud.product.pojo.entity.ProductCategory;

import java.util.List;

/**
 * Function:
 *
 * @author zhangsunjiankun - 2019/5/24 下午4:35
 */
public interface CategoryService {

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}

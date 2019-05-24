package site.zhangsun.springcloud.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import site.zhangsun.springcloud.product.pojo.entity.ProductCategory;

import java.util.List;

/**
 * Function:
 *
 * @author zhangsunjiankun - 2019/5/24 下午4:44
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
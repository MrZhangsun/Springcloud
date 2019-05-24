package site.zhangsun.springcloud.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import site.zhangsun.springcloud.product.pojo.entity.ProductInfo;

import java.util.List;

/**
 * Function:
 *
 * @author zhangsunjiankun - 2019/5/24 下午4:28
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo, String> {

    List<ProductInfo> findByProductStatus(Integer productStatus);

    List<ProductInfo> findByProductIdIn(List<String> productIdList);
}
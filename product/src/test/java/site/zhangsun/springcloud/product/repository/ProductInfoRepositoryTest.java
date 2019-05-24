package site.zhangsun.springcloud.product.repository;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import site.zhangsun.springcloud.product.pojo.entity.ProductInfo;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Function:
 *
 * @author zhangsunjiankun - 2019/5/24 下午4:29
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {

    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Test
    public void findByProductStatus() {
        List<ProductInfo> products = productInfoRepository.findByProductStatus(0);
        System.out.println(products);
        Assert.assertFalse(products.isEmpty());
    }

    @Test
    public void findByProductIdIn() {
    }
}
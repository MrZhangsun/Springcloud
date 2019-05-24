package site.zhangsun.springcloud.product.repository;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import site.zhangsun.springcloud.product.pojo.entity.ProductCategory;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Function:
 *
 * @author zhangsunjiankun - 2019/5/24 下午4:44
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Test
    public void findByCategoryTypeIn() {
        List<ProductCategory> categoryTypeIn = productCategoryRepository.findByCategoryTypeIn(Arrays.asList(11, 12));
        System.out.println(categoryTypeIn);
        Assert.assertFalse(categoryTypeIn.isEmpty());
    }
}
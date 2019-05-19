package site.zhangsun.springcloud.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Function:
 *
 * @author zhangsunjiankun - 2019/5/19 下午2:59
 */
@RestController
public class ProductController {

    @GetMapping("/getMsg")
    public Object getMsg() {
        return "dsd";
    }
}

package site.zhangsun.springcloud.order.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Function:
 *
 * @author zhangsunjiankun - 2019/5/19 下午3:00
 */
@RestController
public class OrderController {

    @GetMapping("/orders")
    public Object getOrderList() {
        return null;
    }
}

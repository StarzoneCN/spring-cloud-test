package cn.personal.hongxing.springcloud.eurekaconsumerribbonhystrix.controller;

import cn.personal.hongxing.springcloud.eurekaconsumerribbonhystrix.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: LiHongxing
 * @email: lihongxing@bluemoon.com.cn
 * @date: Create in 2018/7/25 22:52
 * @modefied:
 */
@RestController
public class DcController {

    @Autowired
    private ConsumerService consumerService;

    @RequestMapping("consumer")
    public String dc(){
        return consumerService.consumer();
    }
}

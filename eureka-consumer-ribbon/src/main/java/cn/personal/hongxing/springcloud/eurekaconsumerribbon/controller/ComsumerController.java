package cn.personal.hongxing.springcloud.eurekaconsumerribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author: LiHongxing
 * @email: lihongxing@bluemoon.com.cn
 * @date: Create in 2018/7/23 19:11
 * @modefied:
 */
@RestController
public class ComsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("consumer")
    public String consumer(){
        return restTemplate.getForObject("http://eureka-client/index", String.class);
    }
}

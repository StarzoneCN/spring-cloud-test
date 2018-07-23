package cn.personal.hongxing.springcloud.eurekaclient.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: LiHongxing
 * @email: lihongxing@bluemoon.com.cn
 * @date: Create in 2018/7/23 18:26
 * @modefied:
 */
@RestController
@RequestMapping("index")
public class IndexController {

    @RequestMapping
    public String index(){
        return "There is the start of conquering the world !";
    }
}

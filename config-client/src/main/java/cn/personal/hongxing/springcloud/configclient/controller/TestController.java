package cn.personal.hongxing.springcloud.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: LiHongxing
 * @email: lihongxing@bluemoon.com.cn
 * @date: Create in 2018/7/25 20:49
 * @modefied:
 */
@RestController
@RefreshScope
public class TestController {

    @Value("${this.project.creater}")
    private String creater;

    @RequestMapping("creater")
    public String creater(){
        return this.creater;
    }
}

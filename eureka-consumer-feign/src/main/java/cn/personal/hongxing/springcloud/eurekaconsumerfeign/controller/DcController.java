package cn.personal.hongxing.springcloud.eurekaconsumerfeign.controller;

import cn.personal.hongxing.springcloud.eurekaconsumerfeign.client.DcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: LiHongxing
 * @email: lihongxing@bluemoon.com.cn
 * @date: Create in 2018/7/23 20:45
 * @modefied:
 */
@RestController
public class DcController {

    @Autowired
    private DcClient dcClient;

    @GetMapping("consumer")
    public String index(String name){
        return dcClient.index(name);
    }
}

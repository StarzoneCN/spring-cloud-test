package cn.personal.hongxing.springcloud.eurekaconsumerribbonhystrix.service.impl;

import cn.personal.hongxing.springcloud.eurekaconsumerribbonhystrix.service.ConsumerService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author: LiHongxing
 * @email: lihongxing@bluemoon.com.cn
 * @date: Create in 2018/7/25 22:45
 * @modefied:
 */
@Service
public class ConsumerServiceImpl implements ConsumerService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    @HystrixCommand(fallbackMethod = "fallback")
    public String consumer(){
        return restTemplate.getForObject("http://eureka-client/dc", String.class);
    }

    public String fallback(){
        return "fallback";
    }
}

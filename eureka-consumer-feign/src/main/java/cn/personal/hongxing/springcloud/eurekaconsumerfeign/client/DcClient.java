package cn.personal.hongxing.springcloud.eurekaconsumerfeign.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("eureka-client")
public interface DcClient {

    @GetMapping("dc")
    String dc();

    @GetMapping("index/hello")
    String index(@RequestParam("name") String name);
}

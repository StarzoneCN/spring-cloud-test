package cn.personal.hongxing.springcloud.simpleboot.controller;

import cn.personal.hongxing.springcloud.simpleboot.vo.UserVo;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author: LiHongxing
 * @email: lihongxing@bluemoon.com.cn
 * @date: Create in 2018/7/23 21:21
 * @modefied:
 */
@RestController
@RequestMapping("user")
public class UserController {

    @PostMapping("add")
    public String add(@RequestBody UserVo vo){
        return "success";
    }
}

package com.example.myshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Description:
 *
 * @Author chenj
 * @Create 2024/8/6 10:29
 * @Version 1.0
 */
@Controller//
public class HelloController {

    @RequestMapping("/sayHello")
    @ResponseBody//这个注解表示返回的结果是JSON格式；
    public String sayHello(){
        return "hello,springboot!!";
    }
}

package com.vito16.nacosconfigdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("/")
@RefreshScope
public class DemoController {
    @Value("${user.name:}")
    String userName;

    @Value("${user.age:0}")
    int age;

    @GetMapping("/user")
    @ResponseBody
    public String vv(){
        return "姓名："+userName+", 年龄 : "+age;
    }
}

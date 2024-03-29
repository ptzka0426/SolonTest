package com.example.demo.controller;

import cn.hutool.core.net.NetUtil;
import com.example.demo.dso.service.userService;
import org.noear.solon.annotation.Controller;
import org.noear.solon.annotation.Inject;
import org.noear.solon.annotation.Mapping;
import org.noear.solon.annotation.Param;

@Controller
public class DemoController {
    @Inject
    userService appService;

    @Mapping("/hello")
    public String hello(@Param(defaultValue = "world") Integer userName) throws Exception {

        return String.format("Hello %s!", appService.getApp(userName).getUsername());

    }

    @Mapping("/hello1")
    public String hello1(@Param(defaultValue = "world") Integer userName) throws Exception {

        System.out.println("ping:" + NetUtil.ping("47.242.95.94"));
        return String.format("Hello %s!", "测试成功！");

    }

}
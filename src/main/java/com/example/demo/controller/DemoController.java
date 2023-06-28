package com.example.demo.controller;

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
}
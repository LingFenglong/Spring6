package com.lingfenglong.spring6.resource.controller;

import com.lingfenglong.spring6.resource.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;

@Controller("myUserController")
public class UserController {
//    // 1. 指定name
//    @Resource(name = "myUserServiceImpl")
//    private UserService userService;

    // 3. 不指定name，且属性名不匹配，按照类型自动注入
    @Resource
    private UserService myUserService;

    public void add() {
        System.out.println("UserController add");
        myUserService.add();
    }
}

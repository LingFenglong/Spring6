package com.lingfenglong.iocxml.auto.controller;

import com.lingfenglong.iocxml.auto.service.UserService;

public class UserController {
    private UserService userService;
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void addUser() {
        System.out.println("UserController");
        userService.addUserService();
    }
}

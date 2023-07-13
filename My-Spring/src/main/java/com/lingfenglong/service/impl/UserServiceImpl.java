package com.lingfenglong.service.impl;

import com.lingfenglong.annotation.Bean;
import com.lingfenglong.annotation.Di;
import com.lingfenglong.dao.UserDao;
import com.lingfenglong.dao.impl.UserDaoImpl;
import com.lingfenglong.service.UserService;

@Bean
public class UserServiceImpl implements UserService {
    @Di
    private UserDao userDao;
    @Override
    public void add() {
        System.out.println("UserServiceImpl add");
        userDao.add();
    }

    @Override
    public String toString() {
        return "UserServiceImpl{" +
                "userDao=" + userDao +
                '}';
    }
}

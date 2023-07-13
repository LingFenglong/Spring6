package com.lingfenglong.spring6.autowired.service;

import com.lingfenglong.spring6.autowired.UserDao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    @Autowired
    @Qualifier("userRedisDaoImpl")
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void add() {
        System.out.println("UserServiceImpl add");
        userDao.add();
    }
}

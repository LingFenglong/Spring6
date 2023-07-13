package com.lingfenglong.iocxml.auto.service;

import com.lingfenglong.iocxml.auto.dao.UserDao;

public class UserServiceImpl implements UserService{
    private UserDao userDao;
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    @Override
    public void addUserService() {
        System.out.println("addUserService");
        userDao.addUserDao();
    }
}

package com.lingfenglong.dao.impl;

import com.lingfenglong.annotation.Bean;
import com.lingfenglong.dao.UserDao;

@Bean
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("UserDaoImpl add");
    }
}

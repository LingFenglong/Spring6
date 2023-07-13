package com.lingfenglong.spring6.resource.UserDao;

import org.springframework.stereotype.Repository;

@Repository("myUserDaoImpl")
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("UserDaoImpl add");
    }
}

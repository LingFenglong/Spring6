package com.lingfenglong.spring6.resource.UserDao;

import org.springframework.stereotype.Repository;

@Repository("myUserRedisDaoImpl")
public class UserRedisDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("UserRedisDaoImpl add");
    }
}

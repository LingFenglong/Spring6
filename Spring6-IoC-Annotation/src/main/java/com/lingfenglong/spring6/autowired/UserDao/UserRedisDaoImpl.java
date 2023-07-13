package com.lingfenglong.spring6.autowired.UserDao;

import org.springframework.stereotype.Repository;

@Repository
public class UserRedisDaoImpl implements UserDao{
    @Override
    public void add() {
        System.out.println("UserRedisDaoImpl add");
    }
}

package com.lingfenglong.spring6.resource.service;

import com.lingfenglong.spring6.resource.UserDao.UserDao;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("myUserServiceImpl")
public class UserServiceImpl implements UserService {
    // 不指定名称，按照属性名
    @Resource
    private UserDao myUserDaoImpl;

    @Override
    public void add() {
        System.out.println("UserServiceImpl add");
        myUserDaoImpl.add();
    }
}

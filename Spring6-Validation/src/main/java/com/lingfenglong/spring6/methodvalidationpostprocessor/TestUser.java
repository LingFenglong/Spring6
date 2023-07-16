package com.lingfenglong.spring6.methodvalidationpostprocessor;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(classes = SpringConfig.class)
public class TestUser {
    @Autowired
    private ApplicationContext context;

    @Test
    public void test01() {
        User user = new User();
        user.setName("Steve");
        user.setAge(19);
        user.setPhone("15265799612");

        MyService myService = context.getBean(MyService.class);
        System.out.println(myService.testUser(user));
    }
}

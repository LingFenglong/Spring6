package com.lingfenglong.spring6.autowired.test;

import com.lingfenglong.spring6.autowired.controller.UserController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowired {
    @Test
    public void testAutowired() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        UserController userController = context.getBean("userController", UserController.class);
        userController.add();
    }
}

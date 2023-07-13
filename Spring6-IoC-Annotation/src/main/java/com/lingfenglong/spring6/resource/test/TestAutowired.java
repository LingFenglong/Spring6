package com.lingfenglong.spring6.resource.test;

import com.lingfenglong.spring6.resource.config.SpringConfig;
import com.lingfenglong.spring6.resource.controller.UserController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowired {
    @Test
    public void testResource() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        UserController userController = context.getBean("myUserController", UserController.class);
        userController.add();
    }
    @Test
    public void testConfiguration() {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        UserController userController = context.getBean("myUserController", UserController.class);
        userController.add();
    }
}

package com.lingfenglong.entity;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {
    @Test
    public void testUserObject() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        // 对象在DefaultListableBeanFactory Map<String, BeanDefinition> beanDefinitionMaps
        User user = (User) context.getBean("user");
        System.out.println(user);
        user.add();
    }

    @Test
    public void createUserObjectByReflect() throws Exception {
        Class cls = Class.forName("com.lingfenglong.entity.User");
        User user = (User) cls.getDeclaredConstructor().newInstance();

        System.out.println(user);
        user.add();
    }
}

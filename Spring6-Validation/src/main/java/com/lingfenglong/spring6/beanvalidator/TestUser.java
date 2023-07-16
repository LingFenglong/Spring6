package com.lingfenglong.spring6.beanvalidator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(classes = ValidationConfig.class)
public class TestUser {

    @Autowired
    private ApplicationContext context;
    @Test
    public void testJavaValidation() {
        User user = new User();

        JavaValidation javaValidation = context.getBean(JavaValidation.class);
        System.out.println(javaValidation.userValidator(user));
        System.out.println(user.getName());
        System.out.println(user.getAge());
    }

    @Test
    public void testSpringValidation() {
        User user = new User();

        SpringValidation springValidation = context.getBean(SpringValidation.class);
        System.out.println(springValidation.userValidator(user));
    }
}

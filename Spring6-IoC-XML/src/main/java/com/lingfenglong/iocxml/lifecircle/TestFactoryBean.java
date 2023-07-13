package com.lingfenglong.iocxml.lifecircle;

import com.lingfenglong.iocxml.factorybean.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFactoryBean {
    @Test
    public void testFactoryBean() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-factorybean.xml");

        User user = context.getBean("user", User.class);
        System.out.println(user);
    }
}

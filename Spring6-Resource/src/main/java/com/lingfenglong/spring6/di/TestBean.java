package com.lingfenglong.spring6.di;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {
    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        ResourceBean resourceBean = context.getBean("resourceBean", ResourceBean.class);
        resourceBean.parse();
    }
}

package com.lingfenglong.spring6.prefix;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

import java.nio.charset.StandardCharsets;

public class TestDemo {
    @Test
    public void test01() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:beans.xml");
        Resource resource = context.getResource("resourceFile.txt");

        System.out.println(resource.getContentAsString(StandardCharsets.UTF_8));
    }
}

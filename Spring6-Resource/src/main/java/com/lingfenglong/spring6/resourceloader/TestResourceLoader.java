package com.lingfenglong.spring6.resourceloader;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.nio.charset.StandardCharsets;

@SpringJUnitConfig(locations = "classpath:beans.xml")
public class TestResourceLoader {
    @Autowired
    private ApplicationContext context;

    @Test
    public void test01() throws Exception {
        Resource resource = new ClassPathXmlApplicationContext().getResource("resourceFile.txt");

        System.out.println(resource.getClass());

        System.out.println(resource.getURL());
        System.out.println(resource.getFilename());
        System.out.println(resource.getDescription());
        System.out.println(resource.getContentAsString(StandardCharsets.UTF_8));
    }

    @Test
    public void test02() throws Exception {
        Resource resource = new FileSystemXmlApplicationContext().getResource("src/main/resources/resourceFile.txt");

        System.out.println(resource.getClass());

        System.out.println(resource.getURL());
        System.out.println(resource.getFilename());
        System.out.println(resource.getDescription());
        System.out.println(resource.getContentAsString(StandardCharsets.UTF_8));
    }
}

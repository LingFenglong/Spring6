package com.lingfenglong.sc;

import com.alibaba.druid.pool.DruidDataSource;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Qualifier
@Resource
public class DITest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Entity entity1 = context.getBean("entity1", Entity.class);
        Entity entity2 = context.getBean("entity2", Entity.class);
        entity1.getMap().entrySet().forEach(System.out::println);
        System.out.println("--------------------");
        entity2.getMap().entrySet().forEach(System.out::println);

        DruidDataSource druidDataSource = context.getBean(DruidDataSource.class);
        System.out.println(druidDataSource.getUrl());
        System.out.println(druidDataSource.getDriverClassName());
        System.out.println(druidDataSource.getUsername());
        System.out.println(druidDataSource.getPassword());
    }
}

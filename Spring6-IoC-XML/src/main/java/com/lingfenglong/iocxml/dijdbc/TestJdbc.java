package com.lingfenglong.iocxml.dijdbc;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestJdbc {
    @Test
    public void testJdbc() {
        DruidDataSource dataSource1 = new DruidDataSource();
        dataSource1.setUrl("jdbc:mysql://localhost:3306/spring");
        dataSource1.setUsername("root");
        dataSource1.setDriverClassName("com.mysql.cj.jdbc.Driver");

        ApplicationContext context = new ClassPathXmlApplicationContext("bean-jdbc.xml");
        DruidDataSource dataSource2 = context.getBean("druidDataSource", DruidDataSource.class);

        System.out.println("dataSource1 url: " + dataSource1.getUrl() + "\r\n" + "dataSource2 url: " + dataSource2.getUrl());
    }
}

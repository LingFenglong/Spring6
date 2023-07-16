package com.lingfenglong.spring6.cannotblank;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(SpringConfig.class)
public class TestMessage {

    @Autowired
    private ApplicationContext context;

    @Test
    public void test01() {
        Message message = new Message("p e r s o n");
        ValidService validService = context.getBean("validService", ValidService.class);

        System.out.println(validService.testMessage(message));
    }
}

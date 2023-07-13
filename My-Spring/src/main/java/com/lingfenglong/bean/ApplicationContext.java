package com.lingfenglong.bean;

public interface ApplicationContext {
    <T> T getBean(Class cls);
}

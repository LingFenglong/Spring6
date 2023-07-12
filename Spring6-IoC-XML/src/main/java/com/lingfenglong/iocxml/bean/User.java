package com.lingfenglong.iocxml.bean;

public class User implements Eat {
    private String name;
    private Integer age;

    public void run() {
        System.out.println("run ...");
    }

    @Override
    public void eat() {
        System.out.println("eat ...");
    }
}

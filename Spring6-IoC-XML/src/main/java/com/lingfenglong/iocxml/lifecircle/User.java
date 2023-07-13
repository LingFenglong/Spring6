package com.lingfenglong.iocxml.lifecircle;

public class User {
    private String name;

    public User() {
        System.out.println("1. NoArgsConstructor");
    }

    public void init() {
        System.out.println("4. Init");
    }

    public void destroy() {
        System.out.println("5. Destroy");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("2. Setter");
    }
}

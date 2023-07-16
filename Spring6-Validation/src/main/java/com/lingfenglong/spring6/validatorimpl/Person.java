package com.lingfenglong.spring6.validatorimpl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
public class Person {
    private String name;
    private int age;
}

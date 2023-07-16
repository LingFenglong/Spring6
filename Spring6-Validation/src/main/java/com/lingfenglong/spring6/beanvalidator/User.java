package com.lingfenglong.spring6.beanvalidator;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @NotNull
    private String name;

    @Min(0)
    @Max(150)
    private int age;
}

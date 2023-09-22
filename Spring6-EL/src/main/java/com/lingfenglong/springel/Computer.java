package com.lingfenglong.springel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
@NoArgsConstructor
@AllArgsConstructor
public class Computer {
    @Value("Dell")
    private String brand;

    @Autowired
    private Memory memory;

    @Value("#{memory.memorySize}")
    private Integer memorySize;

}

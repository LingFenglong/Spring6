package com.lingfenglong.springel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Memory {
    @Value("kingston")
    private String brand;
    @Value("64")
    private Integer memorySize;

}

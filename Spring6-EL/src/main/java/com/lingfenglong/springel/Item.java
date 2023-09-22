package com.lingfenglong.springel;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Item {
    @Value("#{'tea'.toUpperCase()}")
    private String upName;

    @Value("#{mathUtil.getLength()}")
    private int itemLength;

    @Value("#{mathUtil.getArea(5)}")
    private double area;

}

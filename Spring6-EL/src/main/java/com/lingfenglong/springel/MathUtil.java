package com.lingfenglong.springel;

import org.springframework.stereotype.Component;

@Component("mathUtil")
public class MathUtil {
    public int getLength() {
        return 100;
    }

    public double getArea(double r) {
        return 2 * Math.PI * r * r;
    }
}

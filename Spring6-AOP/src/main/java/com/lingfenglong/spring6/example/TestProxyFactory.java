package com.lingfenglong.spring6.example;

import org.junit.jupiter.api.Test;

public class TestProxyFactory {
    @Test
    public void testProxyFactory() {
        ProxyFactory proxyFactory = new ProxyFactory(new CalculatorImpl());
        Calculator calculator = (Calculator) proxyFactory.getProxy();

        int res = calculator.add(10, 20);
        System.out.println(res);
    }
}

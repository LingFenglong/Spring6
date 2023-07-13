package com.lingfenglong.spring6.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.reflect.Proxy;
import java.util.Arrays;

public class ProxyFactory {
    private Object target;
    private static final Logger log = LogManager.getLogger(ProxyFactory.class);

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxy() {
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                (proxy, method, args) -> {
                    Object res = method.invoke(target, args);
                    log.debug(target + "." + method.getName() + "(" + Arrays.toString(args) + ") " + "return " + res);
                    return res;
                });
    }
}

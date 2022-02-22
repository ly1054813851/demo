package com.example.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author：ly
 * @Data :10:50 2022/2/8
 **/
public class ProxyHandler implements InvocationHandler {

    private Object object;

    public ProxyHandler(Object o){
        this.object = o;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("前置++++");
        method.invoke(object,args);
        System.out.println("后置----");
        return null;
    }
}

package com.example.java8test.dtdl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author：ly
 * @Data :15:18 2022/1/6
 * 动态代理
 **/
public class Dongtaidaili implements InvocationHandler {

    private Object test;

    public Dongtaidaili(Object test){
        this.test = test;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("前置");
        System.out.println("方法名："+method);
        method.invoke(test,args);
        System.out.println("后置");
        return null;
    }
}

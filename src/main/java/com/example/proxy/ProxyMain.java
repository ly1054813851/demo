package com.example.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author：ly
 * @Data :10:52 2022/2/8
 **/
public class ProxyMain {
    public static void main(String[] args) {
        HelloInterface hello = new HelloService();
        InvocationHandler invocationHandler = new ProxyHandler(hello);

        HelloInterface helloInterface = (HelloInterface) Proxy.newProxyInstance(hello.getClass().getClassLoader(), hello.getClass().getInterfaces(), invocationHandler);

        helloInterface.say();
    }
}

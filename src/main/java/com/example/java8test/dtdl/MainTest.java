package com.example.java8test.dtdl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author：ly
 * @Data :15:47 2022/1/6
 **/
public class MainTest {
    public static void main(String[] args) {
        Test test = new TestImp();
        InvocationHandler handler = new Dongtaidaili(test);
        Test testImp = (Test) Proxy.newProxyInstance(handler.getClass().getClassLoader(),test.getClass().getInterfaces(),handler);
        testImp.testdtdl("hello",2);
    }
}

package com.example.proxy;

/**
 * @author：ly
 * @Data :10:53 2022/2/8
 **/
public class HelloService implements HelloInterface{
    @Override
    public String say() {
        System.out.println("hello");
        return "hello";
    }
}
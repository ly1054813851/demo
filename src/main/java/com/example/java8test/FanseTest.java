package com.example.java8test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @author：ly
 * @Data :14:14 2022/1/6
 * 反射
 **/
public class FanseTest {
    public static void main(String[] args) {
//        gogogo g = new gogogo();
//        Class c = g.getClass();
//
        String name = "com.example.java8test.gogogo";
        Class c = null;
        try {
            c = Class.forName(name);
            Object obj = c.newInstance();
            Constructor constructor = c.getConstructor(new Class[]{String.class,int.class});
            constructor.newInstance("ly",27);
            Method method = c.getDeclaredMethod("test", new Class[]{String.class, int.class});
            method.setAccessible(true);
            method.invoke(obj,new Object[]{"yahu",7});
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

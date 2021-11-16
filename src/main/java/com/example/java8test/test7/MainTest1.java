package com.example.java8test.test7;

import java.util.function.Function;

/**
 * @author：ly
 * @Data :10:56 2021/11/10
 **/
public class MainTest1 {

    public static String yahu(Integer a ){
        return a+"";
    }

    public static String test(Function<Integer,String> function,Integer a){
        return function.apply(a);
    }

    public static void main(String[] args) {
        System.out.println(test(MainTest1::yahu,23));
    }
}

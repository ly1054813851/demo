package com.example.java8test.test2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/**
 * 将list抽象化
 * @author：ly
 * @Data :14:29 2021/10/25
 **/
public class maintest3 {

    public static <T> List<T> filter(List<T> list, Predicate2 predicate2){
        List<T> rtnList = new ArrayList<>();
        for(T t : list){
            if(predicate2.test(t)){
                rtnList.add(t);
            }
        }
        return rtnList;
    }

    public static void main(String[] args) {

        Runnable runnable = ()-> System.out.println("hello");
        runnable.run();

    }
}

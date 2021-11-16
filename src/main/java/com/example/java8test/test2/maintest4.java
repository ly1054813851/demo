package com.example.java8test.test2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * 方法引用
 * @author：ly
 * @Data :09:16 2021/10/26
 **/
public class maintest4 {
    public static List<Apple> map(List<Integer> list, Function<Integer,Apple> function){
        List<Apple> rtnlist = new ArrayList<>();
        for(Integer integer : list){
            rtnlist.add(function.apply(integer));
        }
        return rtnlist;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(7,3,4,10);
        List<Apple> list1 = map(list,Apple::new);
        list1.sort(Comparator.comparing(Apple::getWeigth).reversed());
        for (Apple apple : list1){
            System.out.println(apple.getWeigth());
        }

        Predicate<Apple> predicate = (apple -> apple.getWeigth()>3);
        //Consumer
    }
}

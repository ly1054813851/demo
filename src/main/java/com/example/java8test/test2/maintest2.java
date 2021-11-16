package com.example.java8test.test2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 利用匿名内部类
 * @author：ly
 * @Data :14:09 2021/10/25
 **/
public class maintest2 {
    public static List<Apple> filterApples(List<Apple> list, ApplePredicate applePredicate){
        List<Apple> rtnList = new ArrayList<>();
        for(Apple apple: list){
            if(applePredicate.test(apple)){
                rtnList.add(apple);
            }
        }
        return rtnList;
    }

    public static void main(String[] args) {
        List<Apple> list = Arrays.asList(new Apple("red",150),
                new Apple("green",160),
                new Apple("green",170));
        //匿名内部类
//        List<Apple> filterList = filterApples(list, new ApplePredicate() {
//            @Override
//            public boolean test(Apple apple) {
//                return apple.getWeigth()>160;
//            }
//        });
        //lambda
        List<Apple> filterList = filterApples(list,(apple -> "green".equals(apple.getColor())));

        for(Apple apple : filterList){
            System.out.println(apple.getWeigth());
        }
    }
}

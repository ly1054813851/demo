package com.example.java8test.test2;

import java.util.ArrayList;
import java.util.List;

/**
 * 行为参数化
 * @author：ly
 * @Data :13:49 2021/10/25
 **/
public class maintest1 {

    public static List<Apple> filterApples(List<Apple> list,ApplePredicate applePredicate){
        List<Apple> rtnList = new ArrayList<>();
        for(Apple apple: list){
            if(applePredicate.test(apple)){
                rtnList.add(apple);
            }
        }
        return rtnList;
    }

    public static void main(String[] args) {

        List<Apple> list = new ArrayList<>();
        list.add(new Apple("green",160));
        list.add(new Apple("red",150));

        list = filterApples(list,new AppleGreenColorPredicate());
        for(Apple apple : list){
            System.out.println(apple.getColor());
        }


    }
}

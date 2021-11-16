package com.example.java8test.test2;

/**
 * @author：ly
 * @Data :13:54 2021/10/25
 **/
public class AppleGreenColorPredicate implements ApplePredicate{
    @Override
    public boolean test(Apple apple) {
        return "green".equals(apple.getColor());
    }
}

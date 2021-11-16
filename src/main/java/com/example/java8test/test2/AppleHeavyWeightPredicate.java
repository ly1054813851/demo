package com.example.java8test.test2;

/**
 * @author：ly
 * @Data :13:53 2021/10/25
 **/
public class AppleHeavyWeightPredicate implements ApplePredicate{
    @Override
    public boolean test(Apple apple) {
        return apple.getWeigth()>150;
    }
}

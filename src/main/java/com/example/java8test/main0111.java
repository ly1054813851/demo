package com.example.java8test;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author：ly
 * @Data :10:52 2022/1/11
 **/
public class main0111 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 10; ++i){
            list.add(i);
        }

//        for(int j = 0; j < list.size(); ++j){
//            if(j == 1 || j == 2){
//                list.remove(j);
//            }
//        }
        list = list.stream().filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if(integer != 1 && integer != 2){
                    return true;
                }
                return false;
            }
        }).collect(Collectors.toList());
        System.out.println(list.size());
    }
}

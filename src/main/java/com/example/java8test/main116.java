package com.example.java8test;

/**
 * @author：ly
 * @Data :15:34 2022/1/16
 **/
public class main116 {

    public static void main(String[] args) {
        int s = 1, i = 1;
        while (s<16){
            s += ++i;
            System.out.println(s);
            //System.out.println(i);
        }
    }
}

package com.example.java8test;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @author：ly
 * @Data :09:38 2021/12/30
 **/
public class testdl {
    public static void main(String[] args) {
//        Deque<String> deque = new ArrayDeque<String>();
//        deque.push("a");
//        deque.push("b");
//        deque.add("c");
//        System.out.println(deque);
//        Deque<String> deque1 = new LinkedList<>();
//        deque1.push("a");
//        deque1.push("b");
//        deque1.add("c");
//        deque.pop();
//        deque.peek();
//        deque.poll();
//        System.out.println(deque);

        String a = "123adsad";
        String b = a.substring(1,3);
        System.out.println(b);
        String b1 = "23";
        boolean c = false;
        for(int i = 0; i<b1.length();i++){
            c = b.contains(b1.charAt(i)+"");
        }

        System.out.println(c);

    }
}

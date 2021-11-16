package com.example.java8test.test8;


import java.util.logging.Logger;

/**
 * @author：ly
 * @Data :09:40 2021/11/12
 **/
public class MainTest1 {

    public static void doSomething(Runnable r){
        r.run();
    }

    public static void doSomething(Task task){
        task.execute();
    }

    public static void main(String[] args) {

        doSomething((Task) ()-> System.out.println("d"));



    }
}

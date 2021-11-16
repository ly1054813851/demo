package com.example.java8test.test8;

/**
 * @author：ly
 * @Data :09:26 2021/11/12
 **/
public class MainTest8 {

    public static void main(String[] args) {
        int a = 10;
        Runnable runnable = () ->{

            System.out.println(a);
        };

        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                int a = 3;
                System.out.println(a);
            }
        };

        runnable.run();
    }

}

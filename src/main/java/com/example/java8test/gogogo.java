package com.example.java8test;

/**
 * @author：ly
 * @Data :19:33 2022/1/4
 **/
public class gogogo {
    private String name;
    private int age;

    private void test(String a,int b){
        System.out.println(a);
    }

    public gogogo(){
        System.out.println("hello");
    }
    public gogogo(String name,int age){
        this.name = name;
        this.age = age;
        System.out.println("hello "+name+",i am "+ age );
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

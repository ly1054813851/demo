package com.example.java8test.test2;

/**
 * @author：ly
 * @Data :13:51 2021/10/25
 **/
public class Apple {

    public String color;

    public int weigth;

    public Apple() {
    }

    public Apple(int weigth) {
        this.weigth = weigth;
    }

    public Apple(String color, int weigth) {
        this.color = color;
        this.weigth = weigth;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeigth() {
        return weigth;
    }

    public void setWeigth(int weigth) {
        this.weigth = weigth;
    }
}

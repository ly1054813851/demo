package com.example.java8test.test4;


/**
 * @author：ly
 * @Data :09:14 2021/10/29
 **/
public class Dish {
    private final String name;
    private final boolean vegetarian;
    private final int calorise;
    private final Type type;

    public Dish(String name, boolean vegetarian, int calorise, Type type) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.calorise = calorise;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public int getCalorise() {
        return calorise;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return name;
    }
    public enum Type {MEAT,FISH,OTHER}
}

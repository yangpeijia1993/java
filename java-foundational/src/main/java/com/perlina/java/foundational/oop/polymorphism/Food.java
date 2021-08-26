package com.perlina.java.foundational.oop.polymorphism;

/**
 * 食物
 *
 * @author: Perlina
 * @version:2021/8/259:55 PM
 */
public class Food {
    private String name;

    public Food() {

    }

    public Food(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

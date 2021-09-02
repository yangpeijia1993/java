package com.perlina.java.foundational.oop.polymorphism;

/**
 * 动物
 *
 * @author: Perlina
 * @version:2021/8/259:55 PM
 */
public abstract class Animal {
    private String name;

    public Animal() {
    }

    @Override
    public String toString() {
        return "Animal{" +
            "name='" + name + '\'' +
            '}';
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //吃东西
    public abstract void eat();
}

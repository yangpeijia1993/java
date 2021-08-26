package com.perlina.java.foundational.oop.polymorphism;

/**
 * 动物园管理员
 *
 * @author: Perlina
 * @version:2021/8/259:55 PM
 */
public class Zookeeper {
    public void feed(Animal animal,Food food){
        System.out.println(animal.getName()+"正在吃"+food.getName());
    }
}

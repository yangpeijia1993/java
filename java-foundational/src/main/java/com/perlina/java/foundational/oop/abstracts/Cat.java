package com.perlina.java.foundational.oop.abstracts;

/**
 * 猫，动物子类
 *
 * @author: Perlina
 * @version:2021/8/253:14 PM
 */
public class Cat extends Animal{

    @Override
    public void eat() {
        System.out.println("小猫吃鱼");
    }

    @Override
    public void sleep(String nationality) {
        System.out.println(nationality+"小猫在睡觉");
    }

    public Cat() {
    }

    public Cat(String nationality) {
        super(nationality);
    }
}

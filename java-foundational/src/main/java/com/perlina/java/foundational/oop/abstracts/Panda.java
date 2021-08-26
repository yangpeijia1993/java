package com.perlina.java.foundational.oop.abstracts;

/**
 * 熊猫类
 *
 * @author: Perlina
 * @version:2021/8/253:15 PM
 */
public class Panda extends Animal {
    @Override
    public void eat() {
        System.out.println("熊猫吃竹子");
    }

    @Override
    public void sleep(String nationality) {
        System.out.println(nationality+"熊猫正在睡觉");
    }

    public Panda() {
    }

    public Panda(String nationality) {
        super(nationality);
    }
}



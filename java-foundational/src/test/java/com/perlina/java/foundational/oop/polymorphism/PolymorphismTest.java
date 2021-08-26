package com.perlina.java.foundational.oop.polymorphism;

import com.perlina.java.foundational.oop.abstracts.Animal;
import com.perlina.java.foundational.oop.abstracts.Cat;
import com.perlina.java.foundational.oop.abstracts.Panda;

/**
 * 多态的测试
 *
 * @author: Perlina
 * @version:2021/8/259:32 PM
 */
public class PolymorphismTest {
    public static void main(String[] args) {
        //父类引用指向子类对象
        Animal cat = new Cat();
        cat.eat();

        Animal panda = new Panda();
        panda.eat();

        Animal animal = new Cat();
        animal.eat();

        animal = new Panda();
        animal.eat();
    }
}

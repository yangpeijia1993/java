package com.perlina.java.foundational.oop.abstracts;

/**
 * 抽象类测试
 *
 * @author: Perlina
 * @version:2021/8/253:16 PM
 */
public class AbtractsClassTest {
    public static void main(String[] args) {
//        Animal cat = new Cat();
//        cat.eat();
//
//        Animal panda = new Panda();
//        panda.eat();

        Animal cat = new Cat("伊朗");
        cat.sleep(cat.getNationality());

        Animal panda = new Panda("中国");
        panda.sleep(panda.getNationality());
    }
}

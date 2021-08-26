package com.perlina.java.foundational.oop.polymorphism;

/**
 * 动物管理员测试
 *
 * @author: Perlina
 * @version:2021/8/2510:49 PM
 */
public class ZookeeperTest {
    public static void main(String[] args) {
        Zookeeper zookeeper = new Zookeeper();
        Animal animal = new Monkey("金丝猴");
        Food food = new Banana("海南香蕉");
        zookeeper.feed(animal,food);

    }
}

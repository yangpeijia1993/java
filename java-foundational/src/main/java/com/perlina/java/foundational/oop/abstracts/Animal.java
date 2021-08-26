package com.perlina.java.foundational.oop.abstracts;

/**
 * 一个抽象类：动物
 *
 * @author: Perlina
 * @version:2021/8/253:13 PM
 */
public abstract class Animal {

    private String nationality;

    public Animal() {
    }

    public Animal(String nationality) {
        this.nationality = nationality;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public abstract void eat();

    public abstract void sleep(String nationality);
}

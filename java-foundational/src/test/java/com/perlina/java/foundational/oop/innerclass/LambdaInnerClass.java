package com.perlina.java.foundational.oop.innerclass;

import com.perlina.java.foundational.oop.abstracts.Animal;

/**
 * 匿名内部类
 *
 * @author: Perlina
 * @version:2021/8/2611:56 上午
 */
public class LambdaInnerClass {
    public static void main(String[] args) {
        new Animal(){

            @Override
            public void eat() {
                System.out.println("dog eat bouns");
            }

            @Override
            public void sleep(String nationality) {
                System.out.println(nationality+"dog is sleeping");
            }
        }.sleep("tugou");

    }
}

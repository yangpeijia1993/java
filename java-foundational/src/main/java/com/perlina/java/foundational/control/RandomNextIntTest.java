package com.perlina.java.foundational.control;

import java.util.Random;

/**
 * 随机数
 *
 * @author: Perlina
 * @version:2021/8/229:57 AM
 */
public class RandomNextIntTest {
    public static void main(String[] args) {
        //随机数的测试
        Random random = new Random();
        //1-100之间的整数
        //填写一个100，表示[0,100)的区间
        int number = random.nextInt(100)+1;
        System.out.println(number);
    }
}

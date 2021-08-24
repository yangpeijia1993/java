package com.perlina.java.foundational.control.forstatement;

/**
 * 循环嵌套
 *
 * @author: Perlina
 * @version:2021/8/2210:34 AM
 */
public class ForNest {
    public static void main(String[] args) {
        //for循环嵌套，分别统计外层循环和内存循环的次数
        int outCount = 0;
        int innerCount = 0;

        for (int i = 0; i <3 ; i++) {
            outCount++;
            for (int j = 0; j <5 ; j++) {
                innerCount++;
            }
        }

        System.out.println("外层循环："+outCount+"，内层循环："+innerCount);
    }
}

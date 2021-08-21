package com.perlina.java.foundational.operator.autoincrement;

/**
 * 前++和后++参与运算区别
 * @author: Perlina
 * @version:2021/8/214:10 PM
 */
public class AutoIncrementExpressOperator {
    public static void main(String[] args) {
        int num =10;
        int right = num++;
        System.out.println(right);//10,先参与运算赋值
        System.out.println(num);//11，再自增1

        int data = 10;
        int left = ++data;
        System.out.println(left);//11,先自增再参与运算
        System.out.println(data);//11
    }
}


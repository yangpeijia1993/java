package com.perlina.java.foundational.operator.logic;

/**
 * 短路或
 *
 * @author: Perlina
 * @version:2021/8/215:09 PM
 */
public class LogicOrShortCircuit {
    public static void main(String[] args) {
        int left = 10;
        int right = 20;
        boolean flag = left++ >=10 || right--<20;
        System.out.println(left);//11
        System.out.println(right);//20,短路后不在执行后面
        System.out.println(flag);
    }
}

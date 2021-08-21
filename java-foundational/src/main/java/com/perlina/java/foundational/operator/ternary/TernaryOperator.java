package com.perlina.java.foundational.operator.ternary;

/**
 * 三元运算符
 *
 * @author: Perlina
 * @version:2021/8/215:13 PM
 */
public class TernaryOperator {
    public static void main(String[] args) {
        //求两个数最大值
        int left = 10;
        int right = 20;
        //三元表达式
        int max = left>right?left:right;
        int min = left<right?left:right;
        System.out.println(max);
        System.out.println(min);
    }
}

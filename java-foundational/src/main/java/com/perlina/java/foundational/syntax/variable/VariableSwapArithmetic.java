package com.perlina.java.foundational.syntax.variable;

/**
 * 通过算数运算交换变量
 *
 * @author: Perlina
 * @version:2021/8/223:54 PM
 */
public class VariableSwapArithmetic {
    public static void main(String[] args) {
        int left = 10;
        int right = 20;
        System.out.println("left:"+left);
        System.out.println("right:"+right);

        //可能数据会溢出，或者精度损失
        left = left+right;
        right = left-right;
        left = left-right;

        System.out.println("left:"+left);
        System.out.println("right:"+right);
    }
}

package com.perlina.java.foundational.syntax.variable;

/**
 * 异或交换变量
 *
 * @author: Perlina
 * @version:2021/8/223:59 PM
 */
public class VariableSwapXor {
    public static void main(String[] args) {
        int left = 10;
        int right = 20;
        System.out.println("left:"+left);
        System.out.println("right:"+right);

        //异或
        left = left^right;
        right = left^right;
        left = left^right;

        System.out.println("left:"+left);
        System.out.println("right:"+right);
    }
}

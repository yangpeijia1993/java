package com.perlina.java.foundational.syntax.variable;

/**
 * 中间变量交换变量的值
 *
 * @author: Perlina
 * @version:2021/8/223:51 PM
 */
public class VariableSwapTemp {
    public static void main(String[] args) {
        int left = 10;
        int right = 20;
        System.out.println("left:"+left);
        System.out.println("right:"+right);

        //需要使用额外的内存空间
        int temp;
        temp = left;
        left = right;
        right = temp;
        System.out.println("left:"+left);
        System.out.println("right:"+right);
        System.out.println(temp);
    }
}

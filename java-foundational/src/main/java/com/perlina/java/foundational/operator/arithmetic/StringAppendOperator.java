package com.perlina.java.foundational.operator.arithmetic;

/**
 * 字符串拼接
 *
 * @author: Perlina
 * @version:2021/8/213:58 PM
 */
public class StringAppendOperator {
    public static void main(String[] args) {
        //字符串常量拼接整数
        System.out.println("10+10="+(10+10));

        //字符串变量拼接整数
        String str="";
        String res = str + 10;
        System.out.println(res);
    }
}

package com.perlina.java.foundational.operator.ternary;

/**
 * 三元运算符注意事项
 *
 * @author: Perlina
 * @version:2021/8/215:17 PM
 */
public class TernaryOperatorWarning {
    public static void main(String[] args) {
        //一般情况下，三元运算符表达式结果1，结果2的数据类型要保持一致

        //类型不一致时
        double res = true?12:100.0;
        System.out.println(res);//12.0,自动数据类型转换

//        int res1 = true?100:12.0; //12.0不能自动转换为int类型
        int res1 = true?100:(int)12.0;
        System.out.println(res1);

        //不使用变量接收，直接打印输出
        System.out.println(true?12:100.0);//12.0，运算时自动提升数据类型
        System.out.println(false?12:100.0);
    }
}

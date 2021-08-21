package com.perlina.java.foundational.operator.arithmetic;

/**
 * 算数运算符
 *
 * @author: Perlina
 * @version:2021/8/213:50 PM
 */
public class ArithmeticOperator {
    public static void main(String[] args) {
        //常量运算
        System.out.println(10 + 20);

        //变量运算
        int num1 = 10;
        int num2 = 3;
        //加法
        System.out.printf("%d + %d = %d \n",num1,num2,num1+num2);
        //减法
        System.out.printf("%d - %d = %d \n",num1,num2,num1-num2);
        //乘法
        System.out.printf("%d * %d = %d \n",num1,num2,num1*num2);
        //除法
        System.out.printf("%d / %d = %d \n",num1,num2,num1/num2);
        //取余
        System.out.printf("%d %% %d = %d \n",num1,num2,num1%num2);

        //char类型
        char ch = 'a';
        //需要将char提升为int，不然与%d不匹配
        System.out.printf("%d + %d - %d = %d \n",(int)ch,num1,num2,ch+num1-num2);
    }
}

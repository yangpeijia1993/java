package com.perlina.java.foundational.operator.arithmetic;

import java.util.Scanner;

/**
 * 整数的翻转
 * @author: Perlina
 * @version:2021/8/214:16 PM
 */
public class NumberReversion {
    public static void main(String[] args) {
        System.out.println("请输入一个需要翻转的整数：");
        //标准输入
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("你输入的数字是："+number);

        int res = 0;
        while (number != 0){
            int bit = number%10;
            res = res*10+bit;
            number = number/10;
        }
        System.out.println("翻转后的结果是："+res);
    }
}

package com.perlina.java.foundational.control.whilestatement;

import java.util.Scanner;

/**
 * while循环应用
 *
 * @author: Perlina
 * @version:2021/8/2212:21 AM
 */
public class WhileStatementPositiveNagetive {
    public static void main(String[] args) {
        //用户输入数据，计算正整数和负整数的个数，输入0时退出
        Scanner input = new Scanner(System.in);

        int positiveCount = 0;
        int nagetiveCount = 0;
        int number =1;
        while (number != 0){
            System.out.println("请输入一个数字：");
            number = input.nextInt();

            //判断正负
            if (number>0){
                positiveCount++;
            }else if(number<0){
                nagetiveCount++;
            }
        }
        System.out.printf("正数为%d个，负数为%d个",positiveCount,nagetiveCount);
    }
}

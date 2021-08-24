package com.perlina.java.foundational.control.ifstatement;

import java.util.Scanner;

/**
 * ifelse语句
 *
 * @author: Perlina
 * @version:2021/8/2110:18 PM
 */
public class IfElseStatement {
    public static void main(String[] args) {
        //判断一个数是奇数还是偶数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num = sc.nextInt();

        if (num%2 == 0){
            System.out.println("输入的是个偶数");
        }else{
            System.out.println("输入的是个奇数");
        }
    }
}

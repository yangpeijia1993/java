package com.perlina.java.foundational.control.ifstatement;

import java.util.Scanner;

/**
 * if语句
 *
 * @author: Perlina
 * @version:2021/8/2110:14 PM
 */
public class IfStatement {
    public static void main(String[] args) {
        //单if语句
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的年龄：");
        int age = sc.nextInt();

        if (age>=18){
            System.out.println("恭喜你成年了");
        }
    }
}

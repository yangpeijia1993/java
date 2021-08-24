package com.perlina.java.foundational.control.switchstatement;

import java.util.Scanner;

/**
 * switch case语句
 *
 * @author: Perlina
 * @version:2021/8/2110:49 PM
 */
public class SwitchCaseStatement {
    public static void main(String[] args) {
        //根据用户输入的数字，输出对应的星期
        Scanner input =new Scanner(System.in);

        System.out.println("输入一个数字：");
        int number = input.nextInt();

        switch (number){
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期天");
                break;
            default:
                System.out.println("输入的数字有误");
                break;
        }
    }
}

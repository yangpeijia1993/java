package com.perlina.java.foundational.control.switchstatement;

import java.util.Scanner;

/**
 * switch/case穿透，根据月份判断季度
 *
 * @author: Perlina
 * @version:2021/8/2111:08 PM
 */
public class SwitchCasePenetrateMonthSeason {
    public static void main(String[] args) {
        //根据月份判断季度
        Scanner input =new Scanner(System.in);

        System.out.println("请输入一个月份：");
        int month = input.nextInt();

        //判断季度
        switch (month){
            case 1:
            case 2:
            case 3:
                System.out.println("第一季度");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("第二季度");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("第三季度");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("第四季度");
                break;
            default:
                System.out.println("您输入的月份不合法");
                break;
        }
    }
}

package com.perlina.java.foundational.control.switchstatement;

import java.util.Scanner;

/**
 * switch/case穿透现象
 *
 * @author: Perlina
 * @version:2021/8/2111:03 PM
 */
public class SwitchCasePenetrate {
    public static void main(String[] args) {
        //根据用户输入的数字判断是工作日还是休息日
        Scanner input =new Scanner(System.in);

        System.out.println("请输入一个数字");
        int number = input.nextInt();

        switch (number){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("工作日");
                break;
            case 6:
            case 7:
                System.out.println("休息日");
                break;
            default:
                System.out.println("输入有误");
        }
    }
}

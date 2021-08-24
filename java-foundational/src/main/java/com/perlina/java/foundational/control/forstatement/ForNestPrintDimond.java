package com.perlina.java.foundational.control.forstatement;

import java.util.Scanner;

/**
 * 打印菱形
 *
 * @author: Perlina
 * @version:2021/8/2211:33 AM
 */
public class ForNestPrintDimond {
    public static void main(String[] args) {
        //打印一个*菱形:空格和*组合
        //第一行一个*，n个空格，第二行2个*，n-1空格
        Scanner input = new Scanner(System.in);

        System.out.println("请输入要打印的菱形的边长：");
        int num = input.nextInt();


        for (int line = 1; line <= num ; line++) {
            //打印空格

            for (int blank = 1; blank <= num-line; blank++) {
                System.out.print(" ");
            }

            //打印*
            for (int xing = 1; xing <= line ; xing++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int line = num-1; line >= 0 ; line--) {
            //打印空格

            for (int blank = 1; blank <= num-line; blank++) {
                System.out.print(" ");
            }

            //打印*
            for (int xing = line; xing > 0 ; xing--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

package com.perlina.java.foundational.operator.ternary;

import java.util.Scanner;

/**
 * 求三个数的最大值
 *
 * @author: Perlina
 * @version:2021/8/215:26 PM
 */
public class TernaryMaxOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int left = sc.nextInt();
        System.out.println("请输入第二个数：");
        int mid = sc.nextInt();
        System.out.println("请输入第三个数：");
        int right = sc.nextInt();

        //求三个整数中的最大数
        int max = (left>mid?left:mid)>right?(left>mid?left:mid):right;
        System.out.println(max);
    }
}

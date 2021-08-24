package com.perlina.java.foundational.control.ifstatement;

import java.util.Scanner;

/**
 * if/elseif/else语句
 *
 * @author: Perlina
 * @version:2021/8/2110:27 PM
 */
public class IfElseIfElseStatement {
    public static void main(String[] args) {
        //判断两个数的大小关系
        Scanner input = new Scanner(System.in);

        System.out.println("请输入第一个数：");
        int left = input.nextInt();

        System.out.println("请输入第二个数：");
        int right = input.nextInt();

        if (left<right){
            System.out.printf("%d < %d",left,right);
        }else if (left>right){
            System.out.printf("%d > %d",left,right);
        }else{
            System.out.printf("%d = %d",left,right);
        }
    }
}

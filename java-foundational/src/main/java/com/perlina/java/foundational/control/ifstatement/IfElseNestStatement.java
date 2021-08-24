package com.perlina.java.foundational.control.ifstatement;

import java.util.Scanner;

/**
 * if/else嵌套语句
 *
 * @author: Perlina
 * @version:2021/8/2110:36 PM
 */
public class IfElseNestStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("请输入您的分数：");
        int score = input.nextInt();

        if (score>=0 && score<=100){
            if (score>=90){
                System.out.println("优秀");
            }else if (score>=80){
                System.out.println("良好");
            }else if (score>=70){
                System.out.println("中等");
            }else if (score>=60){
                System.out.println("及格");
            }else{
                System.out.println("不及格");
            }
        }else {
            System.out.println("您输入的分数不合法，请输入一个0-100之间整数");
        }
    }
}

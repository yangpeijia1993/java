package com.perlina.java.foundational.control.ifstatement;

import java.util.Scanner;

/**
 * 分数的等级
 *
 * @author: Perlina
 * @version:2021/8/2110:28 PM
 */
public class ScoreAndGrade {
    public static void main(String[] args) {
        //判断分数的等级
        Scanner input = new Scanner(System.in);
        System.out.println("请输入你的分数：");
        int score = input.nextInt();

        if (score>=90 && score<=100){
            System.out.println("优秀");
        }else if (score>=80 && score<90){
            System.out.println("良好");
        }else if (score>=60 && score<80){
            System.out.println("及格");
        }else if (score>=0 && score<60){
            System.out.println("不及格");
        }else{
            System.out.println("输入的成绩不合法");
        }
    }
}

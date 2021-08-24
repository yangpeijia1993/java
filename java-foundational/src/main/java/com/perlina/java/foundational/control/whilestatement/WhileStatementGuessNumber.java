package com.perlina.java.foundational.control.whilestatement;

import java.util.Random;
import java.util.Scanner;

/**
 * 猜随机数
 *
 * @author: Perlina
 * @version:2021/8/2210:10 AM
 */
public class WhileStatementGuessNumber {
    public static void main(String[] args) {
        //电脑随机产生一个数字，人输入数字猜对退出
        //随机数字 1-100之间
        Random random = new Random();
        int randomNum = random.nextInt(100)+1;

        //键盘输入一个数字
        System.out.println("请输入一个1-100之间的整数：");

        //比较
        int count = 0;
        while (true){
            Scanner input = new Scanner(System.in);
            int inputNum = input.nextInt();

            if (randomNum > inputNum){
                count++;
                System.out.println("您输入的数字太小了，请重新输入：");
            }else if (randomNum < inputNum){
                count++;
                System.out.println("您输入的数字太大了，请重新输入：");
            }else if (randomNum == inputNum){
                count++;
                System.out.printf("您输入的数字是%d，随机生成的数字是%d",inputNum,randomNum);
                System.out.printf("您一共输入了%d次",count);
                break;
            }
            else {
                count++;
                System.out.println("您输入的数字不合法");
            }
        }

    }
}

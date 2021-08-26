package com.perlina.java.foundational.control.switchstatement;


import java.util.Scanner;

/**
 * java7变量可以匹配string
 *
 * @author: Perlina
 * @version:2021/8/2110:59 PM
 */
public class Java7SwitchCaseStatementString {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("请输入您的性别：男/女？");
        String gender = input.next();
        String greeting = "您好，";

        switch (gender){
            case "男":
                greeting += "先生";
                break;
            case "女":
                greeting += "女士";
                break;
            default:
                greeting +="顾客";
        }
        System.out.println(greeting);

    }
}

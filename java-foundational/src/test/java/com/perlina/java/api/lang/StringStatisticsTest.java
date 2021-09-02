package com.perlina.java.api.lang;

import java.util.Scanner;

/**
 * 统计字符串字符个数
 *
 * @author: Perlina
 * @version:2021/8/2712:32 下午
 */
public class StringStatisticsTest {
    //组合length(),charAt()方法，判断字符有两种方式
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = input.next();

        int upperCaseCount = 0;
        int lowerCaseCount = 0;
        int numberCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)){
                upperCaseCount++;
            }else if (Character.isLowerCase(ch)){
                lowerCaseCount++;
            }else if (Character.isDigit(ch)){
                numberCount++;
            }
            /**
             *第二种判断方式
            if (ch >= 'A' && ch<= 'Z'){
                upperCaseCount++;
            }else if (ch >='a' && ch<= 'z'){
                lowerCaseCount++;
            }else if (ch >= '0' && ch<='9'){
                numberCount++;
            }
             */
        }

        System.out.println("输入的字符串是："+str);
        System.out.printf("大写字母：%d，小写字母：%d，数字：%d",upperCaseCount,lowerCaseCount,numberCount);
    }
}

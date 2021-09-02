package com.perlina.java.api.text;

import com.perlina.java.api.utils.DateTimeUtils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.atomic.DoubleAccumulator;

/**
 * 输入出生日期计算出生天数
 *
 * @author: Perlina
 * @version:2021/8/278:06 下午
 */
public class CaculatorBirthdayTest {
    public static void main(String[] args) {
        //键盘输入生日
        Scanner input = new Scanner(System.in);
        System.out.println("请输入您的出生日期，例如：2021年01月01日");
        String birthday = input.next();

        //计算出生日期
        Date currentDate = new Date();
        Date birthdayDate = DateTimeUtils.stringToDate(birthday, DateTimeUtils.STANDARD_DATE_FORMAT);
        long calculateTime = DateTimeUtils.calculateTime(birthdayDate.getTime(), currentDate.getTime());

        long days = calculateTime/1000/24/60/60;
        System.out.println("你的出生日期是："+birthday+"，你已经来到这世上"+days+"天了");
    }
}

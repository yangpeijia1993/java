package com.perlina.java.api.time;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

/**
 * LocalDate常用方法测试
 *
 * @author: Perlina
 * @version:2021/8/279:25 下午
 */
public class LocalDateTest {
    LocalDate now = LocalDate.now();

    @BeforeClass
    public void initLocalDate(){
        System.out.println("当前日期信息是："+now);
    }
    /**
     * 获取实例的方法
     */
    @Test
    public void testLocalDateInstance(){
        //第一种方法
        LocalDate now = LocalDate.now();
        System.out.println(now);//2021-08-27

        //第二种方法
        LocalDate ofDate = LocalDate.of(1993, 7, 19);
        System.out.println(ofDate);//1993-07-19
    }

    /**
     * 通过LocalDate获取日期相关信息
     */
    @Test
    public void testLocalDateGetDateInfo(){
        int year = now.getYear();
        Month month = now.getMonth();
        int dayOfMonth = now.getDayOfMonth();
        System.out.println("当前的日期信息是："+year+"年"+month.getValue()+"月"+dayOfMonth+"日");

        //今天是这周的第几天
        DayOfWeek dayOfWeek = now.getDayOfWeek();
        System.out.println("今天是这周的第"+dayOfWeek.getValue()+"天");

        //今天是当年的第几天
        int dayOfYear = now.getDayOfYear();
        System.out.println("今天是当年的第"+dayOfYear+"天");

        //判断是否闰年
        System.out.println("当前年是否是闰年:"+now.isLeapYear());
        LocalDate ofDate = LocalDate.of(2020, 8, 8);
        System.out.println(ofDate.getYear()+"年是否是闰年:"+ofDate.isLeapYear());

        //判断今年有多少天
        System.out.println("今年有"+now.lengthOfYear()+"天");
        //判断这个月有多少天
        System.out.println("这个月有"+now.lengthOfMonth()+"天");

        /**
         * 当前的日期信息是：2021年8月27日
         * 今天是这周的第5天
         * 今天是当年的第239天
         * 当前年是否是闰年:false
         * 2020年是否是闰年:true
         * 今年有365天
         * 这个月有31天
         */
    }

    /**
     * LocalDate 日期修改
     * with开头，因为LocalDate都是不可变的，修改后需要新变量接收
     */
    @Test
    public void testLocalDateUpdateByWith(){
        LocalDate withYear = now.withYear(2018);
        System.out.println("修改当前年份为2018年后展示："+withYear);

        LocalDate withMonth = now.withMonth(9);
        System.out.println("修改当前月份为9月后展示："+withMonth);

        LocalDate withDayOfMonth = now.withDayOfMonth(28);
        System.out.println("修改当前天数为28号后展示："+withDayOfMonth);

        //链式编程,一次将当前时间修改为1993-07-19
        LocalDate finalDate = now.withYear(1993).withMonth(7).withDayOfMonth(19);
        System.out.println("一次将当前时间修改为1993-07-19后展示："+finalDate);

        //通过with方法修改当前年份
        LocalDate withY = now.with(ChronoField.YEAR, 2019);
        System.out.println("通过with方法修改年为2019后展示："+withY);

        LocalDate withM = now.with(ChronoField.MONTH_OF_YEAR, 3);
        System.out.println("通过with方法修改月为3后展示："+withM);

        LocalDate withD = now.with(ChronoField.DAY_OF_MONTH, 22);
        System.out.println("通过with方法修改日为22后展示："+withD);
    }

    /**
     * LocalDate 日期的算数运算：加减
     */
    @Test
    public void testLocalDatePlusMinus(){
        LocalDate daysPlus5 = now.plus(5, ChronoUnit.DAYS);
        System.out.println("当前日期+5："+daysPlus5);//2021-09-01

        LocalDate yearsMinus10 = now.minus(10, ChronoUnit.YEARS);
        System.out.println("当前年-10："+yearsMinus10);//当前年-10：2011-08-27
    }

    /**
     * 是否在指定日期之前或在指定日期之后
     */
    @Test
    public void testLocalDateIsBeforeIsAfter(){
        LocalDate dateBefore = LocalDate.of(2020,8,27);
        System.out.println("dateBefore的信息："+dateBefore);
        System.out.println(now.isBefore(dateBefore));//false
        System.out.println(now.isAfter(dateBefore));//true
    }
}

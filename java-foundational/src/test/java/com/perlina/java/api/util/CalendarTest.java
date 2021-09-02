package com.perlina.java.api.util;

import org.testng.annotations.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 日历类常用测试方法
 *
 * @author: Perlina
 * @version:2021/8/278:28 下午
 */
public class CalendarTest {

    /**
     * 构造方法两种形式
     *
     */
    @Test
    public void testCalendarInstance(){
        //第一种方式，使用子类构造方法
        Calendar gregorianCalendar = new GregorianCalendar();

        //第二中方式，使用静态方法获得实例
        Calendar calendar = Calendar.getInstance();
    }

    /**
     * 通过get方法获得日历相关的日期信息
     */
    @Test
    public void testCalendatGet(){
        Calendar calendar = Calendar.getInstance();

        //获得日历信息
        int year = calendar.get(Calendar.YEAR);
        //月从0开始，美国习惯
        int month = calendar.get(Calendar.MONTH)+1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);

        System.out.printf("日历的信息：%d年 %d月 %d日 %d时 %d分 %d秒",
            year,month,day,hour,minute,second);
    }

    /**
     * 按照指定的field设置或者增加指定值
     * @see Calendar#set(int, int)
     * @see Calendar#add(int, int)
     */
    @Test
    public void testCalendarSetAdd(){
        Calendar calendar = Calendar.getInstance();
        //将日历的年份设置为1993
        calendar.set(Calendar.YEAR,1993);
        System.out.println(calendar.get(Calendar.YEAR));//1993

        //将年份加上10年
        calendar.add(Calendar.YEAR,10);
        System.out.println(calendar.get(Calendar.YEAR));//2003
    }

    /**
     * 将Date对象转换为日历
     */
    @Test
    public void testCalendarSetTime(){
        Date date = new Date(5000);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        //获得日历信息
        int year = calendar.get(Calendar.YEAR);
        //月从0开始，美国习惯
        int month = calendar.get(Calendar.MONTH)+1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);

        System.out.printf("日历的信息：%d年 %d月 %d日 %d时 %d分 %d秒",
            year,month,day,hour,minute,second);
        //日历的信息：1970年 1月 1日 8时 0分 5秒
    }

    /**
     * before()
     * after()
     */
    @Test
    public void testCalendarBeforeAfter(){
        Date date = new Date(5000);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        Calendar calendar1 = Calendar.getInstance();
        System.out.println(calendar.before(calendar1));//true
        System.out.println(calendar.after(calendar1));//false
    }
}

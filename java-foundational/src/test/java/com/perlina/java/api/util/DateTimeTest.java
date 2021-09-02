package com.perlina.java.api.util;

import com.perlina.java.api.utils.DateTimeUtils;
import org.testng.annotations.Test;
import org.w3c.dom.ls.LSOutput;

import java.time.Instant;
import java.util.Date;

/**
 * 日期时间测试方法
 *
 * @author: Perlina
 * @version:2021/8/276:51 下午
 */
public class DateTimeTest {

    /**
     * Date类的构造方法
     */
    @Test
    public void testDateConstructor(){
        Date date = new Date();
        System.out.println("当前时间："+date);//当前时间：Fri Aug 27 18:56:26 CST 2021

        /**标准基本时间 1970年 01月 01日 00：00
         * 中国标准时间 1970年 01月 01日 08：00
         * 指定偏移量就是在中国标准时间上偏移
         */
        Date offsetDate = new Date(2000);
        System.out.println("offsetDate："+offsetDate);// offsetDate：Thu Jan 01 08:00:02 CST 1970
    }

    /**
     * 获取当前时间偏移数
     * @see Date#getTime()
     * 设置距当前时间偏移数
     * @see Date#setTime(long)
     */
    @Test
    public void testDateGetTimeSetTime(){
        Date currentDate = new Date();
        System.out.println(currentDate.getTime());//1630063712097

        currentDate.setTime(5000);
        System.out.println(currentDate);//Thu Jan 01 08:00:05 CST 1970
    }

    /**
     * 日期的比较：比较当前日期是否在指定日期之前或之后
     * @see Date#before(Date)
     * @see Date#after(Date)
     */
    @Test
    public void testDateBeforeAfter(){
        Date currentDate = new Date();
        Date offsetDate = new Date(2000);

        System.out.println(currentDate.before(offsetDate));//false
        System.out.println(currentDate.after(offsetDate));//true
    }

    /**
     * 将UTC时间转为Date对象
     */
    @Test
    public void testUTCTime2Date(){
        Instant instant = Instant.now();
        System.out.println(instant);

        String utcTime = "2021-08-28T07:57:39.638Z";
        Date utc2Date = DateTimeUtils.utcTime2Date(utcTime);
        System.out.println("将utc时间"+utcTime+"转为date："+utc2Date);
    }

    /**
     * 将Date对象转为UTC Time
     */
    @Test
    public void testDate2UTCTime(){
        Date date = new Date();
        String utcTime = DateTimeUtils.date2UTCTime(date);
        System.out.println("将date对象"+date+"转换为UTC Time："+utcTime);
    }
}

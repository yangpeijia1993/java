package com.perlina.java.api.text;

import org.testng.annotations.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * DateFormat类测试方法
 *
 * @author: Perlina
 * @version:2021/8/277:42 下午
 */
public class DateFormatTest {
    /**
     * 日期对象 转 日期字符串
     * @see java.text.DateFormat#format(Date)
     */
    @Test
    public void testDateFormatFormat(){
        Date date = new Date();
        System.out.println(date);//Fri Aug 27 19:55:40 CST 2021

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(dateFormat.format(date));//2021-08-27 19:55:40
    }

    /**
     * 日期字符串 转 日期对象
     * @see java.text.DateFormat#parse(String)
     * 日期字符型与日期格式必须一致，否则解析不了
     */
    @Test
    public void testDateFormatParse(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date parseDate = dateFormat.parse("2021-08-27 19:55:40");
            System.out.println(parseDate);//Fri Aug 27 19:55:40 CST 2021
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }


}

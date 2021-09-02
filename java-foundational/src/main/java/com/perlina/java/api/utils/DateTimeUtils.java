package com.perlina.java.api.utils;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期时间类
 *
 * @author: Perlina
 * @version:2021/8/266:42 下午
 */
public class DateTimeUtils {
    public static final String STANDARD_DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
    public static final String STANDARD_DATE_T_TIME_FORMAT = "yyyy-MM-dd'T'HH:mm:ss";
    public static final String STANDARD_DATE_T_TIME_MIL_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSS";
    public static final String STANDARD_UTC_DATE_T_TIME_MIL_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";
    public static final String STANDARD_DATE_FORMAT = "yyyy年MM月dd日";
    public static final String STANDARD_TIME_FORMAT = "HH时mm分ss秒";

    /**
     * 计算程序运行时间
     * @param startTime
     * @param endTime
     * @return
     */
    public static long calculateTime(long startTime,long endTime){
        if (startTime > endTime){
            throw new RuntimeException("时间非法");
        }
        long time = endTime - startTime;
//        System.out.println("开始时间:"+startTime+",结束时间："+endTime
//            +"，一共耗时："+time);
        return time;
    }

    /**
     * 按照默认的日期格式 将日期对象转为日期字符串
     * @param date
     * @return
     */
    public static String dateToString(Date date){
        DateFormat format = new SimpleDateFormat(STANDARD_DATE_TIME_FORMAT);
        String formatStr = format.format(date);
        return formatStr;
    }

    /**
     * 按照指定的日期格式 将日期对象转为日期字符串
     * @param date
     * @param Pattern
     * @return
     */
    public static String dateToString(Date date,String Pattern) {
        DateFormat format = new SimpleDateFormat(Pattern);
        String formatStr = format.format(date);
        return formatStr;
    }

    /**
     * 按照默认的日期格式  将日期字符串转为日期对象
     * @param sourse
     * @return
     */
    public static Date stringToDate(String sourse){
        DateFormat format = new SimpleDateFormat(STANDARD_DATE_TIME_FORMAT);
        Date parseDate = null;
        try {
            parseDate = format.parse(sourse);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return parseDate;
    }

    /**
     * 按照指定的日期格式  将日期字符串转为日期对象
     * @param sourse
     * @param pattern
     * @return
     */
    public static Date stringToDate(String sourse,String pattern){
        DateFormat format = new SimpleDateFormat(pattern);
        Date parseDate = null;
        try {
            parseDate = format.parse(sourse);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return parseDate;
    }

    /**
     * 将UTC时间转换Date对象
     * @param uctTime
     * @return
     */
    public static Date utcTime2Date(String uctTime){
        DateTime parseDateTime = DateTime.parse(uctTime, DateTimeFormat.forPattern(STANDARD_UTC_DATE_T_TIME_MIL_FORMAT));

        Date date = parseDateTime.toDate();
        return date;
    }

    /**
     * 将date对象转为utc时间
     * @param date
     * @return
     */
    public static String date2UTCTime(Date date){
        DateTime dateTime = new DateTime(date, DateTimeZone.UTC);
        String utcTime = dateTime.toString();
        return utcTime;
    }
}

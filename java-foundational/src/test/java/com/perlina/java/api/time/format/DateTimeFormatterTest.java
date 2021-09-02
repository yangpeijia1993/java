package com.perlina.java.api.time.format;

import com.perlina.java.api.utils.DateTimeUtils;
import org.testng.annotations.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * DateTimeFormatter测试方法
 *
 * @author: Perlina
 * @version:2021/8/2812:53 上午
 */
public class DateTimeFormatterTest {
    private LocalDate currentDate = LocalDate.now();
    private LocalTime currentTime = LocalTime.now();
    private LocalDateTime currentDateTime = LocalDateTime.now();
    /**
     * LocalDate format()
     */
    @Test
    public void testLocalDateFormat(){
        System.out.println("ISO标准日期："+currentDate.format(DateTimeFormatter.ISO_LOCAL_DATE));

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(DateTimeUtils.STANDARD_DATE_FORMAT);
        System.out.println("自定义日期："+currentDate.format(dateTimeFormatter));
    }

    /**
     * LocalDate parse()
     */
    @Test
    public void testLocalDateParse(){
        /**
         * ISO标准日期：2021-08-28
         * 自定义日期：2021年08月28日
         */
        System.out.println(LocalDate.parse("2021-08-28"));
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(DateTimeUtils.STANDARD_DATE_FORMAT);
        System.out.println(LocalDate.parse("2021年08月28日", dateTimeFormatter));
    }

    /**
     * LocalTime format()
     */
    @Test
    public void testLocalTimeFormat(){
        System.out.println("标准格式时间："+currentTime.format(DateTimeFormatter.ISO_LOCAL_TIME));
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(DateTimeUtils.STANDARD_TIME_FORMAT);
        System.out.println("自定义格式时间："+currentTime.format(dateTimeFormatter));
    }

    /**
     * LocalTime parse()
     */
    @Test
    public void testLocalTimeParse(){
        /**
         * 标准格式时间：01:16:35.861968
         * 自定义格式时间：01时16分35秒
         */
        System.out.println(LocalTime.parse("01:16:35.861968"));
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(DateTimeUtils.STANDARD_TIME_FORMAT);
        System.out.println(LocalTime.parse("01时16分35秒", dateTimeFormatter));
    }

    /**
     * LocalDateTime format()
     */
    @Test
    public void testLocalDateTimeFormat(){
        System.out.println(currentDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(DateTimeUtils.STANDARD_DATE_T_TIME_FORMAT);
        System.out.println(currentDateTime.format(dateTimeFormatter));
    }

    /**
     * LocalDateTime parse()
     */
    @Test
    public void testLocalDateTimeParse(){
        /**
         * 2021-08-28T01:20:15.066146
         * 2021-08-28T01:20:15
         */
        System.out.println(LocalDateTime.parse("2021-08-28T01:20:15.066146"));
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(DateTimeUtils.STANDARD_DATE_T_TIME_FORMAT);
        System.out.println(LocalDateTime.parse("2021-08-28T01:20:15", dateTimeFormatter));
    }
}

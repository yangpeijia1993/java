package com.perlina.java.api.time;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * LocalDateTime测试方法
 *
 * @author: Perlina
 * @version:2021/8/2812:19 上午
 */
public class LocalDateTimeTest {
    private LocalDateTime currentDateTime;

    @BeforeClass
    public void initLocalDateTime(){
        currentDateTime = LocalDateTime.of(LocalDate.now(),LocalTime.now());
        System.out.println("当前时间信息："+currentDateTime);
    }

    /**
     * 获取实例的两种方法
     */
    @Test
    public void testLocalDateTimeInstance(){
        //第一种方式
        LocalDateTime currentDateTime = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println("当前时间信息："+currentDateTime);

        //第二种方式
        LocalDateTime customDateTime = LocalDateTime.of(2021, 8, 28, 0, 22, 22);
        System.out.println("自定义的时间信息："+customDateTime);
    }

    /**
     * 获取LocalDate和LocalTime对象
     */
    @Test
    public void testLocalDateTimeGetLocalDateLocalTime(){
        LocalDate localDate = currentDateTime.toLocalDate();
        LocalTime localTime = currentDateTime.toLocalTime();

        System.out.println(localDate);
        System.out.println(localTime);
    }
}

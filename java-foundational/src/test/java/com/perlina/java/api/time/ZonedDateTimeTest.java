package com.perlina.java.api.time;

import org.testng.annotations.Test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;
import java.util.TreeSet;

/**
 * ZonedDateTime常用方法测试
 *
 * @author: Perlina
 * @version:2021/8/289:19 上午
 */
public class ZonedDateTimeTest {

    /**
     * 获取所有可用时区的方法
     */
    @Test
    public void testGetZonedInfo(){
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();

        //将所有可用时区有序打印
        TreeSet<String> availableZoneIdsTreeSet = new TreeSet<>(availableZoneIds);
        //availableZoneIdsTreeSet.forEach(System.out::println);

        //获取指定时区的时区
        ZoneId tokyoZonedId = ZoneId.of("Asia/Tokyo");
        System.out.println(tokyoZonedId);

        //系统默认时区
        ZoneId defaultZoneId = ZoneId.systemDefault();
        System.out.println(defaultZoneId);
    }

    /**
     * 获取实例的方法
     */
    @Test
    public void testZonedDateTimeGetInstance(){
        //第一种方法
        ZonedDateTime defaultZonedDateTime = ZonedDateTime.now();
        System.out.println("系统默认时区："+defaultZonedDateTime);
        //系统默认时区：2021-08-28T09:23:00.180401+08:00[Asia/Shanghai]

        //第二种方法
        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
        ZonedDateTime tokyoZonedDateTime = ZonedDateTime.now(tokyoZone);
        System.out.println("东京时区时间："+tokyoZonedDateTime);

        //第三种方法
        LocalDateTime currentDateTime = LocalDateTime.now();
        ZonedDateTime tokyoZonedLocalDateTime = ZonedDateTime.of(currentDateTime, tokyoZone);
        System.out.println("将当前时区时间包装成Asia/Tokyo的时区时间："+tokyoZonedLocalDateTime);
    }
}

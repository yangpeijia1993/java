package com.perlina.java.api.time;

import org.testng.annotations.Test;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * Instant常用方法
 *
 * @author: Perlina
 * @version:2021/8/2810:00 上午
 */
public class InstantTest {

    /**
     * Instant获取实例的方法
     */
    @Test
    public void testInstantGetInstance(){
        //第一种方法
        Instant currentInstant = Instant.now();
        //获取的是当前UTC时间 -8
        System.out.println("当前UTC时间戳："+currentInstant);

        //第二种方法
        //基准时间+3秒
        Instant plus3SecondInstant = Instant.ofEpochSecond(3);
        System.out.println("基准时间+3秒："+plus3SecondInstant);
        //基准值+3秒+1_000_000_000纳秒，1_000_000_000纳秒等于1秒
        Instant plus4SecondInstant = Instant.ofEpochSecond(3, 1_000_000_000);
        System.out.println("基准时间+4秒："+plus4SecondInstant);

        /**
         * 当前UTC时间戳：2021-08-28T02:06:14.987844Z
         * 基准时间+3秒：1970-01-01T00:00:03Z
         * 基准时间+4秒：1970-01-01T00:00:04Z
         */
    }

    /**
     * 将Instant转为ZonedDateTime
     */
    @Test
    public void testInstant2ZonedDateTime(){
        Instant currentInstant = Instant.now();

        //将Instant转为时区日期时间
        ZoneId shanghaiZonedId = ZoneId.of("Asia/Shanghai");
        ZonedDateTime shanghaiZonedDateTime = currentInstant.atZone(shanghaiZonedId);
        System.out.println("将时间戳转为上海时区时间："+shanghaiZonedDateTime);

        ZoneId tokyoZonedId = ZoneId.of("Asia/Tokyo");
        ZonedDateTime tokyoZonedDateTime = currentInstant.atZone(tokyoZonedId);
        System.out.println("将时间戳转为东京时区时间："+tokyoZonedDateTime);

        /**
         * 将时间戳转为上海时区时间：2021-08-28T10:13:37.070834+08:00[Asia/Shanghai]
         * 将时间戳转为东京时区时间：2021-08-28T11:13:37.070834+09:00[Asia/Tokyo]
         */
    }
}

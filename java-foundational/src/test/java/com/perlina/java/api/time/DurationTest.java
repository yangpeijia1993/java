package com.perlina.java.api.time;

import org.testng.annotations.Test;

import java.time.Duration;
import java.time.LocalTime;

/**
 * Duration测试方法
 *
 * @author: Perlina
 * @version:2021/8/2812:40 上午
 */
public class DurationTest {

    /**
     * 两个时间的时间差
     */
    @Test
    public void testDurationBetween(){
        LocalTime startTime = LocalTime.of(10,33,20);
        LocalTime endTime = LocalTime.of(11,0,20);
        Duration duration = Duration.between(startTime, endTime);

        System.out.println("两个时间相差"+duration.getSeconds()+"秒");
    }
}

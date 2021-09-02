package com.perlina.java.api.time;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.LocalTime;

/**
 * LocalTime类的测试方法
 *
 * @author: Perlina
 * @version:2021/8/2711:37 下午
 */
public class LocalTimeTest {
    private LocalTime now = LocalTime.now();

    @BeforeClass
    public void initLocalTime(){
        System.out.println("当前时间是："+now);
    }

    /**
     * 两种获取LocalTime实例的方法
     */
    @Test
    public void testLocalTimeInstance(){
        //第一种方式
        LocalTime now = LocalTime.now();
        System.out.println("当前时间信息："+now);

        //第二种方式
        LocalTime customTime = LocalTime.of(23, 35, 25);
        System.out.println("自定义的时间："+customTime);
    }

    /**
     * 获取当前时间信息
     */
    @Test
    public void testLocalTimeGetInfo(){
        System.out.println(now.getHour()+"时"+now.getMinute()+"分"
        +now.getSecond()+"秒"+now.getNano()+"纳秒");
        //23时47分51秒609893000纳秒
    }

    /**
     * 修改时间信息
     */
    @Test
    public void testLocalTimeUpdateTime(){
        LocalTime with1Hour = now.withHour(1);
        System.out.println("修改小时部分为1："+with1Hour);

        LocalTime with25Minute = now.withMinute(25);
        System.out.println("修改分部分为25："+with25Minute);

        LocalTime with0Second = now.withSecond(0);
        System.out.println("修改秒部分为0："+with0Second);

        LocalTime with100Nano = now.withNano(100);
        System.out.println("修改纳秒部分为100："+with100Nano);

        //链式编程一次修改
        System.out.println(now.withHour(0).withMinute(0).withSecond(0));
    }

    /**
     * 时间判断
     * 在指定时间之前，之后
     */
    @Test
    public void testLocalTimeIsBeforeIsAfter(){
        LocalTime with1Hour = now.withHour(1);
        System.out.println("修改小时部分为1："+with1Hour);

        System.out.println("当前时间是否在1点之前："+now.isBefore(with1Hour));
        System.out.println("当前时间是否在1点之后："+now.isAfter(with1Hour));
    }

    /**
     * LocalTime对象四则运算
     */
    @Test
    public void testLocalTimePlusMinus(){
        System.out.println("当前时间加1小时："+now.plusHours(1));
        System.out.println("当前时间减1小时："+now.minusHours(1));

        System.out.println("当前时间加10分钟："+now.plusMinutes(10));
        System.out.println("当前时间减10分钟："+now.minusMinutes(10));
    }
}

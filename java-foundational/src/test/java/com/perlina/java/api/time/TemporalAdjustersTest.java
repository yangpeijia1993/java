package com.perlina.java.api.time;

import org.testng.annotations.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

/**
 * 特殊日期查找更改TemporalAdJusters
 *
 * @author: Perlina
 * @version:2021/8/2810:17 上午
 */
public class TemporalAdjustersTest {

    /**
     * 测试TemporalAdjusters的常用方法
     */
    @Test
    public void testTemporalAdjusters(){
        LocalDate currentDate = LocalDate.now();
        System.out.println("当前时间信息："+currentDate);

        System.out.println();

        System.out.println("修改为本月第一天："+currentDate.with(TemporalAdjusters.firstDayOfMonth()));
        System.out.println("修改为本月最后一天："+currentDate.with(TemporalAdjusters.lastDayOfMonth()));
        System.out.println();
        System.out.println("修改为本年第一天："+currentDate.with(TemporalAdjusters.firstDayOfYear()));
        System.out.println("修改为本年最后一天："+currentDate.with(TemporalAdjusters.lastDayOfYear()));
        System.out.println();
        System.out.println("修改为下个月第一天："+currentDate.with(TemporalAdjusters.firstDayOfNextMonth()));
        System.out.println("修改为下一年第一天："+currentDate.with(TemporalAdjusters.firstDayOfNextYear()));
        System.out.println();
        System.out.println("修改为本月的第一个星期天："+currentDate.with(TemporalAdjusters.firstInMonth(DayOfWeek.SUNDAY)));
        System.out.println("修改为本月的最后一个星期天："+currentDate.with(TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY)));
    }
}

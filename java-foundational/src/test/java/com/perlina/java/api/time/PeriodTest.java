package com.perlina.java.api.time;

import org.testng.annotations.Test;

import java.time.LocalDate;
import java.time.Period;

/**
 * Period方法测试
 *
 * @author: Perlina
 * @version:2021/8/279:58 下午
 */
public class PeriodTest {
    /**
     * 计算两个日期时间差
     */
    @Test
    public void testPeriodBetween(){
        LocalDate startDate = LocalDate.of(1993,7,19);
        LocalDate endDate = LocalDate.of(2021,8,27);

        Period between = Period.between(startDate, endDate);
        int days = between.getDays();
        int months = between.getMonths();
        int years = between.getYears();
        System.out.printf("相隔 %d 年，%d月，%d天",years,months,days);
    }
}

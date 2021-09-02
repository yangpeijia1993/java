package com.perlina.java.joda.time;

import com.perlina.java.api.utils.DateTimeUtils;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.testng.annotations.Test;

/**
 * JodaTime测试方法
 *
 * @author: Perlina
 * @version:2021/8/283:13 下午
 */
public class JodaTimeTest {

    /**
     *DateTime方法
     */
    @Test
    public void testDateTime(){

        DateTime currentDateTime = DateTime.now();
        System.out.println("当前日期时间信息："+currentDateTime.toString(DateTimeUtils.STANDARD_DATE_TIME_FORMAT));

        System.out.println("当前时间加上3个月："+currentDateTime.plusMonths(3).toString(DateTimeUtils.STANDARD_DATE_TIME_FORMAT));
        System.out.println("当前时间减2年："+currentDateTime.minusYears(2).toString(DateTimeUtils.STANDARD_DATE_TIME_FORMAT));
    }

    /**
     * LocalDate方法
     */
    @Test
    public void testLocalDate(){
        LocalDate currentLocalDate = LocalDate.now();
        System.out.println("当前日期信息："+currentLocalDate);

        //计算当前日期3个月后的最后一天
        LocalDate plus3lastLocalDate = currentLocalDate.plusMonths(3).dayOfMonth().withMaximumValue();
        System.out.println("3个月后的最后一天:"+plus3lastLocalDate);

        //计算当前日期2个月前的第一天
        LocalDate minus2FirstLocalDate = currentLocalDate.minusMonths(2).dayOfMonth().withMinimumValue();
        System.out.println("2个月前的第一天:"+minus2FirstLocalDate);

        //计算当前日期三年前第5个月的最后一天
        LocalDate plus3Get5MonthLastLocalDate = currentLocalDate.minusYears(3).monthOfYear().setCopy(5).dayOfMonth().withMaximumValue();
        System.out.println("当前日期三年前第5个月的最后一天"+plus3Get5MonthLastLocalDate);
    }
}

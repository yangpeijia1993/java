package com.perlina.java.api.math;

import org.testng.annotations.Test;

import javax.swing.plaf.IconUIResource;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * BigDecimal测试类
 *
 * @author: Perlina
 * @version:2021/8/2611:05 下午
 */
public class BigDecimalTest {
    /**
     * 浮点数问题
     */
    @Test
    public void testFloatPrecision(){
        System.out.println(1.0 - 0.1);
        System.out.println(1.0 - 0.32);
    }

    /**
     * BigDecimal 错误的构造
     * 不要使用double类型数据
     *
     */
    @Test
    public void testBigDecimalConstructorDouble(){
        //在使用BigDecimal构造时，不要使用double类型数据
        BigDecimal number = new BigDecimal(3.33);
        BigDecimal value = new BigDecimal(1-0.32);
        System.out.println(value);
        System.out.println(number);
    }

    /**
     * BigDecimal 正确的构造
     * 应该使用String
     */
    @Test
    public void testBigDecimalConstructorString(){
        //应该使用String
        BigDecimal left = new BigDecimal("10.0");
        BigDecimal right = new BigDecimal("3.33");

        System.out.println(left);
        System.out.println(right);
    }

    /**
     * BigDecimal 的除法运算
     * 除不尽时报 java.lang.ArithmeticException数运算异常
     * 使用divide重载方法
     */
    @Test
    public void testBigDecimalDivide(){
        BigDecimal left = new BigDecimal("10.0");
        BigDecimal right = new BigDecimal("3.0");

        /**
         * scale:保留位数
         * RoundingMode：取舍模式
         */
        BigDecimal divideResult = left.divide(right,2, RoundingMode.HALF_UP);
        System.out.println(divideResult);
    }
}


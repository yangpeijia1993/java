package com.perlina.java.api.lang;

import org.testng.annotations.Test;

/**
 * Math类测试方法
 *
 * @author: Perlina
 * @version:2021/8/2710:14 上午
 */
public class MathTest {
    /**
     * 整数或小数的绝对值
     */
    @Test
    public void testMathAbs(){
        System.out.println("-10的绝对值"+Math.abs(-10));
        System.out.println("-3.14的绝对值"+Math.abs(-3.14));
        System.out.println("3.14的绝对值"+Math.abs(3.14));
    }

    /**
     * 最大值和最小值
     */
    @Test
    public void testMathMaxMin(){
        int left = 10;
        int right =20;
        System.out.println(Math.max(left,right));
        System.out.println(Math.min(left,right));
    }

    /**
     * 向上取整和向下取整
     */
    @Test
    public void testMathCeilFloor(){
        double value = 3.14;
        //向上取整
        System.out.println(Math.ceil(value));//4.0
        //向下取整
        System.out.println(Math.floor(value));//3.0
    }

    /**
     * 四舍五入
     */
    @Test
    public void testMathRound(){
        double left = 3.4;
        double right = 3.5;
        System.out.println(Math.round(left));//3
        System.out.println(Math.round(right));//4
    }

    /**
     * a 的 b 次幂
     */
    @Test
    public void testMathPow(){
        double left = 2.0;
        double right = 3.0;
        System.out.println(Math.pow(left,right));
    }

    /**
     * 开平方的运算
     */
    @Test
    public void testMathSqrt(){
        double left = 4.0;
        double right = 9.0;
        System.out.println(Math.sqrt(left));//2.0
        System.out.println(Math.sqrt(right));//3.0
    }
}

package com.perlina.java.api.math;

import org.testng.annotations.Test;

import java.math.BigInteger;

/**
 * BigInteger类测试方法
 *
 * @author: Perlina
 * @version:2021/8/2610:37 下午
 */
public class BigIntegerTest {

    /**
     * int和long最大值
     */
    @Test
    public void testIntLongLimit(){
        int intMaxValue = Integer.MAX_VALUE;
        System.out.println("int最大值："+intMaxValue);

        long longMaxValue = Long.MAX_VALUE;
        System.out.println("long最大值："+longMaxValue);
    }

    /**
     * BigInteger 构造方法测试
     */
    @Test
    public void testBigIntegerConstructor(){
        BigInteger value = new BigInteger("9223372036854775808");
        System.out.println(value.toString());
    }

    /**
     * BigInteger加法
     */
    @Test
    public void testBigIntegerAdd(){
        BigInteger left = new BigInteger("9223372036854775808");
        BigInteger right = new BigInteger("1000000000000000000");
        BigInteger addResult = left.add(right);
        System.out.printf("%s + %s = %s",left,right,addResult);
    }

    /**
     * BigInteger减法
     */
    @Test
    public void testBigIntegerSubtract(){
        BigInteger left = new BigInteger("9223372036854775808");
        BigInteger right = new BigInteger("1000000000000000000");
        BigInteger subtractResult = left.subtract(right);
        System.out.printf("%s - %s = %s",left,right,subtractResult);
    }

    /**
     * BigInteger乘法
     */
    @Test
    public void testBigIntegerMultiply(){
        BigInteger left = new BigInteger("9223372036854775808");
        BigInteger right = new BigInteger("1000000000000000000");
        BigInteger multiplyResult = left.multiply(right);
        System.out.printf("%s * %s = %s",left,right,multiplyResult);
    }

    /**
     * BigInteger除法
     */
    @Test
    public void testBigIntegerDivide(){
        BigInteger left = new BigInteger("9223372036854775808");
        BigInteger right = new BigInteger("1000000000000000000");
        BigInteger divideResult = left.divide(right);
        System.out.printf("%s / %s = %s",left,right,divideResult);
    }

    /**
     * BigInteger的数据类型转换
     */
    @Test
    public void testBigIntegerTypeConversion(){
        BigInteger left = new BigInteger("9223372036854775808");
        BigInteger right = new BigInteger("1000000000000000000");
        BigInteger divideResult = left.divide(right);
        System.out.println(divideResult.intValue());
        System.out.println(divideResult.longValue());
        System.out.printf("%s / %s = %s",left,right,divideResult);
    }
}

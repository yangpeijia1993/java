package com.perlina.java.api.util;

import com.perlina.java.api.utils.ArraysUtils;
import com.perlina.java.api.utils.DateTimeUtils;
import com.perlina.java.foundational.method.ArrayUtils;
import org.testng.annotations.Test;

import java.util.Arrays;

/**
 * Arrays测试用例
 *
 * @author: Perlina
 * @version:2021/8/266:21 下午
 */
public class ArraysTest {
    private static final int length = 10_000;
    /**
     * @see Arrays#sort(int[])
     */
    @Test
    public void testArraysSort(){
        int[] numbers = ArraysUtils.generatorArray(length);
        System.out.println("排序之前"+Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("排序之后"+Arrays.toString(numbers));
    }

    /**
     * 测试数组排序的时间
     * @see Arrays#sort(int[]) 的耗时
     */
    @Test
    public void testArraySortTime(){
        long startTime = System.currentTimeMillis();
        int[] numbers = ArraysUtils.generatorArray(length);
        Arrays.sort(numbers);

        long endTime = System.currentTimeMillis();
        DateTimeUtils.calculateTime(startTime,endTime);

    }

    /**
     * 测试自己的冒泡数组排序的时间
     */
    @Test
    public void testArrayUtilsBubbleSortTime(){
        long startTime = System.currentTimeMillis();
        int[] numbers = ArraysUtils.generatorArray(length);
        ArrayUtils.bubbleSort(numbers);

        long endTime = System.currentTimeMillis();
        DateTimeUtils.calculateTime(startTime,endTime);
    }

    @Test
    public void testArrayBinarySearch(){
        long startTime = System.currentTimeMillis();
        int[] number = ArraysUtils.generatorArray(length,100);
        Arrays.sort(number);

        int target = 7743;
        int targetIndex = Arrays.binarySearch(number, target);
        System.out.println("查找的元素的索引是："+targetIndex);
        long endTime = System.currentTimeMillis();
        DateTimeUtils.calculateTime(startTime,endTime);
    }
}

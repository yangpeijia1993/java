package com.perlina.java.api.utils;

/**
 * 自定义数组工具类
 *
 * @author: Perlina
 * @version:2021/8/266:22 下午
 */
public class ArraysUtils {

    /**
     * 生成一个整数的随机数组
     * @param length
     * @return
     */
    public static int[] generatorArray(int length){
        if (length<1){
            throw new RuntimeException("数组长度异常");
        }
        return RandomUtils.randomIntArray(length);
    }

    public static int[] generatorArray(int length,int bound){
        if (length<1){
            throw new RuntimeException("数组长度异常");
        }
        if (bound<1){
            throw new RuntimeException("数组内元素指定范围异常");
        }
        return RandomUtils.randomIntArray(length,bound);
    }
}

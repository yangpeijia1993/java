package com.perlina.java.foundational.array;

import java.util.Arrays;

/**
 * 数组翻转
 *
 * @author: Perlina
 * @version:2021/8/224:06 PM
 */
public class ArrayReversal {
    public static void main(String[] args) {
        //数组元素翻转不能使用新数组
        int[] score = new int[]{22,100,95,21,85,12,75,65,33,109,37};
        int start = 0;
        int end = score.length-1;

        int count = 1;
        while(start<end){
            //交换
            score[start] = score[start]^score[end];
            score[end] = score[start]^score[end];
            score[start] = score[start]^score[end];
            System.out.println("第"+count+"次交换后："+Arrays.toString(score));

            //游标移动
            start++;
            end--;
            count++;
        }
        System.out.println(Arrays.toString(score));
    }
}

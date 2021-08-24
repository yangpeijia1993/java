package com.perlina.java.foundational.array;

import java.util.Arrays;

/**
 * 数组的冒泡排序
 *
 * @author: Perlina
 * @version:2021/8/224:17 PM
 */
public class ArrayBubbleSort {
    public static void main(String[] args) {
        //冒泡排序
        int[] score = new int[]{22,100,95,21,85,12,75,65,33,109,37};
        //轮数为n-1轮
        int  count = 0;
        for (int lun = 0; lun < score.length -1 ; lun++) {
            for (int i = 0; i < score.length -1 -lun ; i++) {
                if (score[i] > score[i+1]){
                    //大就交换
                    score[i] = score[i]^score[i+1];
                    score[i+1] = score[i]^score[i+1];
                    score[i] = score[i]^score[i+1];
                }
            }
            count++;
            System.out.println("第"+count+"轮排序结果是："+Arrays.toString(score));
        }
        System.out.println(Arrays.toString(score));
    }
}

package com.perlina.java.foundational.array;

import java.util.Arrays;

/**
 * 选择排序
 *
 * @author: Perlina
 * @version:2021/8/224:29 PM
 */
public class ArrayChooseSort {
    //选择排序
    public static void main(String[] args) {
        int[] score = new int[]{22,100,95,21,85,12,75,65,33,109,37};

        int count = 0;
        for (int lun = 0; lun < score.length-1 ; lun++) {
            for (int i = lun+1; i < score.length ; i++) {
                if (score[i]<score[lun]){
                    //交换
                    score[lun] = score[lun]^score[i];
                    score[i] = score[lun]^score[i];
                    score[lun] = score[lun]^score[i];
                }
            }
            count++;
            System.out.println("第"+count+"次交换后："+Arrays.toString(score));
        }
        System.out.println(Arrays.toString(score));
    }
}

package com.perlina.java.foundational.array;

/**
 * 最大值和最小值
 * @author: Perlina
 * @version:2021/8/223:37 PM
 */
public class ArrayMaxAndMin {
    public static void main(String[] args) {
        int[] score = new int[]{22,100,95,21,85,75,65,33};
        int max = score[0];
        int min = score[0];
        for (int i = 1; i < score.length; i++) {
            if (score[i]>max){
                max = score[i];
            }
            if (score[i]<min) {
                min = score[i];
            }
        }
        System.out.println("最大值："+max);
        System.out.println("最小值: "+min);
    }
}

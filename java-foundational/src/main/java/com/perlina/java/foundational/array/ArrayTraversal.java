package com.perlina.java.foundational.array;


import java.util.Arrays;

/**
 * 数组的遍历
 *
 * @author: Perlina
 * @version:2021/8/223:28 PM
 */
public class ArrayTraversal {
    public static void main(String[] args) {
        int[] score = new int[]{100,95,85,75,65,33};
        for (int i = 0; i < score.length; i++) {
            System.out.println(score[i]);
        }
        //使用Arrays中toString()可以直接打印数组
        System.out.println(Arrays.toString(score));

        //自己写的方法
        System.out.print("数组打印：[");
        for (int i = 0; i < score.length ; i++) {
            if (i == score.length-1){
                System.out.print(score[i]+"]");
            }else {
                System.out.print(score[i]+", ");
            }
        }
    }
}

package com.perlina.java.foundational.array;

/**
 * 数组求和
 *
 * @author: Perlina
 * @version:2021/8/223:35 PM
 */
public class ArraySum {
    public static void main(String[] args) {
        int[] score = new int[]{100,95,85,75,65,33};
        int sum = 0;
        for (int i = 0; i < score.length ; i++) {
            sum += score[i];
        }
        System.out.println(sum);
    }
}

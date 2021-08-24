package com.perlina.java.foundational.array;

/**
 * 射击游戏平均分
 *
 * @author: Perlina
 * @version:2021/8/223:39 PM
 */
public class ArrayShootingScoreAvg {
    public static void main(String[] args) {
        //10次射击成绩去除最高最低分后的平均成绩
        int[] score = new int[]{0,1,4,3,2,5,6,7,8,9};
        int max = score[0];
        int min = score[0];
        int sum = score[0];
        for (int i = 1; i < score.length; i++) {
            if (score[i]>max){
                max = score[i];
            }
            if (score[i]<min) {
                min = score[i];
            }
            sum += score[i];
        }

        double remainScoreAvg = (sum-max-min)/8.0;
        System.out.println(remainScoreAvg);
    }
}

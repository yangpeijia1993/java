package com.perlina.java.foundational.control.forstatement;

/**
 * 打印1-100奇数
 *
 * @author: Perlina
 * @version:2021/8/2111:24 PM
 */
public class For1To100OddNumber {
    public static void main(String[] args) {
        //打印1-100奇数
        for (int i = 1; i < 100; i++) {
            if (i%2 != 0){
                System.out.print(i+" ");
            }
        }
    }
}

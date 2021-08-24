package com.perlina.java.foundational.control.forstatement;

/**
 * 1-100奇数只和
 *
 * @author: Perlina
 * @version:2021/8/2111:30 PM
 */
public class For1To100OddNumberSum {
    //1-100奇数和
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <100 ; i++) {
            if (i%2 != 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}

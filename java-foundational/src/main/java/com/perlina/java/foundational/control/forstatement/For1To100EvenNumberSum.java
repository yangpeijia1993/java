package com.perlina.java.foundational.control.forstatement;

/**
 * 1-100偶数和
 *
 * @author: Perlina
 * @version:2021/8/2111:27 PM
 */
public class For1To100EvenNumberSum {
    public static void main(String[] args) {
        //1-100偶数和
        int sum = 0;
        for (int i = 1; i <=100 ; i++) {
            if (i%2 == 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}

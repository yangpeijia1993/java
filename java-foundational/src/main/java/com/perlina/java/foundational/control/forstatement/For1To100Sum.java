package com.perlina.java.foundational.control.forstatement;

/**
 * 1-100求和
 *
 * @author: Perlina
 * @version:2021/8/2111:25 PM
 */
public class For1To100Sum {
    public static void main(String[] args) {
        //1-100的和
        int sum = 0;
        for (int i = 1; i <=100 ; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}

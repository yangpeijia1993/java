package com.perlina.java.foundational.control.forstatement;

/**
 * 99乘法表
 *
 * @author: Perlina
 * @version:2021/8/2211:28 AM
 */
public class ForNest99MultipleTable {
    public static void main(String[] args) {
        for (int i = 1; i <=9 ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j+"*"+i+"="+i*j+"\t");
            }
            System.out.println();
        }
    }
}

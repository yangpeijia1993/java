package com.perlina.java.foundational.operator.bit;

/**
 * 按位与
 *
 * @author: Perlina
 * @version:2021/8/218:33 PM
 */
public class BitAndOperator {
    public static void main(String[] args) {
        //左右两边的二进制补码都为1，运算结果为1，否则为0
        System.out.println(255 & 15);//15

        /**
         * 计算过程分析
         * 255：0000 0000 0000 0000 0000 0000 1111 1111
         * 15： 0000 0000 0000 0000 0000 0000 0000 1111
         * &：  0000 0000 0000 0000 0000 0000 0000 1111
         * = 15
         */
    }
}

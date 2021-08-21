package com.perlina.java.foundational.operator.bit;

/**
 * 按位或
 *
 * @author: Perlina
 * @version:2021/8/218:38 PM
 */
public class BitOrOperator {
    public static void main(String[] args) {
        //按位或：左右两边的二进制补码有一个为1，就为1，否则就是0
        System.out.println(128 | 64);//192

        /**
         * 计算过程：
         * 128：0000 0000 0000 0000 0000 0000 1000 0000
         * 12： 0000 0000 0000 0000 0000 0000 0100 0000
         * ｜： 0000 0000 0000 0000 0000 0000 1100 0000
         * = ：192
         */
    }
}

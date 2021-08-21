package com.perlina.java.foundational.operator.bit;

/**
 * 按位异或
 *
 * @author: Perlina
 * @version:2021/8/218:48 PM
 */
public class BitXorOperator {
    public static void main(String[] args) {
        //左右两边二进制补码相同为0，不同为1
        System.out.println(256 ^ 256);//0

        /**
         * 计算过程
         * 256： 0000 0000 0000 0000 0000 0001 0000 0000
         * 256： 0000 0000 0000 0000 0000 0001 0000 0000
         * ^ :  0000  0000 0000 0000 0000 0000 0000 0000
         * = ： 0
         */
    }
}

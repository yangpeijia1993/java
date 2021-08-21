package com.perlina.java.foundational.operator.assignment;

/**
 * 整数溢出
 * @author: Perlina
 * @version:2021/8/215:55 PM
 */
public class IntOverFlow {
    public static void main(String[] args) {
        byte value = (byte)135;
        System.out.println(value);//-121

        /**
         * 135默认是int类型，4个字节
         * 135转为二进制补码1000 0111
         * sout输出的是源码
         * 反码为补码-1：1000 0110
         * 源码为反码最高不变，其他取反：1111 1001
         * 结果；-121
         */
    }
}

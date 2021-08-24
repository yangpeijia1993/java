package com.perlina.java.foundational.array;

/**
 * 数组的动态初始化
 *
 * @author: Perlina
 * @version:2021/8/221:24 PM
 */
public class ArrayDynamicInit {
    public static void main(String[] args) {
        //数据类型[] 数组名 = new 数据类型[数组长度];
        int[] arrayA = new int[3];
        System.out.println(arrayA);//[I@61bbe9ba
        /**
         * [I:整数数组
         * @：分隔符
         * 61bbe9ba：16进制哈希值
         */
        System.out.println(arrayA[0]);
        System.out.println(arrayA[1]);
        System.out.println(arrayA[2]);

        //赋值
        arrayA[0] = 100;
        arrayA[1] = 200;
        arrayA[2] = 300;

        System.out.println(arrayA[0]);
        System.out.println(arrayA[1]);
        System.out.println(arrayA[2]);

    }
}

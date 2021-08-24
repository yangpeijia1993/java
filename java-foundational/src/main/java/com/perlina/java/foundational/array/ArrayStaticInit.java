package com.perlina.java.foundational.array;

/**
 * 数组的静态初始化
 *
 * @author: Perlina
 * @version:2021/8/221:18 PM
 */
public class ArrayStaticInit {
    public static void main(String[] args) {
        /**
         * 数据类型[] 数组名 = new 数据类型[]{元素1，元素...}；
           数据类型[] 数组名 = {元素1，元素2...}；
         */

        int[] arrayA = new int[]{1,2,3};
        char[] arrayB = {'a','b','c'};


        System.out.println(arrayA[0]);
        System.out.println(arrayB[2]);
    }
}

package com.perlina.java.foundational.array;

/**
 * 数组空指针异常
 *
 * @author: Perlina
 * @version:2021/8/223:26 PM
 */
public class ArrayNullPointer {
    public static void main(String[] args) {
        int[] arrayA = new int[3];
        arrayA[0] = 10;
        System.out.println(arrayA[0]);

        //ArrayNullPointer:null访问堆内存
        arrayA = null;
        System.out.println(arrayA[0]);
    }
}

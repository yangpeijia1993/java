package com.perlina.java.foundational.array;

/**
 * 数组索引越界异常
 *
 * @author: Perlina
 * @version:2021/8/223:24 PM
 */
public class ArrayIndexOutofBounds {
    public static void main(String[] args) {
        int[] arrayA = new int[]{10,20};
        //ArrayIndexOutofBounds
        System.out.println(arrayA[2]);
    }
}

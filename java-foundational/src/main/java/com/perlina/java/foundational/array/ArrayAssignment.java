package com.perlina.java.foundational.array;

/**
 * 两个数组指向同一个引用
 *
 * @author: Perlina
 * @version:2021/8/223:15 PM
 */
public class ArrayAssignment {
    public static void main(String[] args) {
        int[] arrayA = new int[]{10,20,30};
        int[] arrayB = arrayA;
        System.out.println("A数组地址"+arrayA);
        System.out.println("B数组地址"+arrayB);
    }
}

package com.perlina.java.foundational.method;

/**
 * 方法的重载
 *
 * @author: Perlina
 * @version:2021/8/244:28 PM
 */
public class MethodOverLoading {

    public static boolean compare(int left,int right){
        System.out.println("int");
        return left==right;
    }

    public static boolean compare(byte left,byte right){
        System.out.println("byte");
        return left==right;
    }

    public static boolean compare(long left,long right){
        System.out.println("long");
        return left==right;
    }

    public static boolean compare(boolean left,boolean right){
        System.out.println("boolean");
        return left==right;
    }
}

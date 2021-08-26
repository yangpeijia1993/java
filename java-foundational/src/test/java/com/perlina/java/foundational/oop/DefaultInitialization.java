package com.perlina.java.foundational.oop;

/**
 * 成员变量和局部变量的默认初始化值
 *
 * @author: Perlina
 * @version:2021/8/2410:05 PM
 */
public class DefaultInitialization {
    public static void main(String[] args) {
        Data data = new Data();
        System.out.println(data.longVar);
        System.out.println(data.dbVar);
        System.out.println(data.chVar);//可不见值
        System.out.println(data.blVar);
        System.out.println(data.arr);
        System.out.println(data.reference);
    }
}

class Data{
    long longVar;
    double dbVar;
    char chVar;
    boolean blVar;

    int[] arr;
    Data reference;
}

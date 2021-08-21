package com.perlina.java.foundational.syntax.variable;

/**
 * 整数类型变量
 *
 * @author: Perlina
 * @version:2021/8/2111:35 AM
 */
public class IntegerVariable {
    public static void main(String[] args) {
        //数值必须要在数据范围内
        byte byteVal = 100;
        short shortVal = 100;
        int intVal = 123456789;
        long longVal = 1000000000000L;

        System.out.println(byteVal);
        System.out.println(shortVal);
        System.out.println(intVal);
        System.out.println(longVal);
    }
}

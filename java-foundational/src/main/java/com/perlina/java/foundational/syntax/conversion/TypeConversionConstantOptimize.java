package com.perlina.java.foundational.syntax.conversion;

/**
 * 类型转换的常量优化机制
 *
 * @author: Perlina
 * @version:2021/8/211:30 PM
 */
public class TypeConversionConstantOptimize {
    public static void main(String[] args) {
        //如果byte，short，char在赋值时，值是一个常量，那么JVM自动将常量转为对应的数据类型
        byte byteVar = 100;
        System.out.println(byteVar);

        char charVar = 97;
        System.out.println(charVar);//a

        //如果byte，short，char在赋值时，值是一个常量，那么JVM自动将常量转为对应的数据类型
        char charVar2 = 93+4;
        System.out.println(charVar2);//a

    }
}

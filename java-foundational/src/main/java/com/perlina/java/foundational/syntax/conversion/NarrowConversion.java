package com.perlina.java.foundational.syntax.conversion;

/**
 * 强制数据类型转换
 *
 * @author: Perlina
 * @version:2021/8/211:12 PM
 */
public class NarrowConversion {
    public static void main(String[] args) {
        //将double转为int
        //范围小数据类型 变量名 = （取值范围较小数据类型）范围大的值或变量
        double doubleVal = 3.14;
        System.out.println(doubleVal);
        //强制转换，强制转换时可能会造成数据精度丢失
        int intVal = (int)doubleVal;
        System.out.println(intVal);
    }
}

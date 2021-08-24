package com.perlina.java.foundational.method;

import java.util.Arrays;

/**
 * 参数传递测试
 *
 * @author: Perlina
 * @version:2021/8/244:45 PM
 */
public class MethodArgsPassTest {
    public static void main(String[] args) {
        //形参改变不影响实参的数据值
        int number = 10;
        System.out.println("实参："+number);
        MethodArgsPass.change(number);
        System.out.println("实参："+number);

        int[] numbers = new int[]{1,2,3};
        System.out.println("实参："+numbers);
        MethodArgsPass.change(numbers);
        System.out.println("实参："+numbers);

        char[] chars = {'c','c','c'};
        System.out.println("实参："+ Arrays.toString(chars));
        MethodArgsPass.change(chars);
        System.out.println("实参："+ Arrays.toString(chars));


    }
}

package com.perlina.java.foundational.method;

import java.util.Arrays;

/**
 * 参数传递
 *
 * @author: Perlina
 * @version:2021/8/244:42 PM
 */
public class MethodArgsPass {
    public static void change(int number){
        System.out.println("形参："+number);
        number = 100;
        System.out.println("形参："+number);
    }

    public static void change(int[] numbers){
        System.out.println("形参："+numbers);
        numbers = new int[]{10,20,30};
        System.out.println("形参："+numbers);
    }

    public static void change(char[] chars){
        System.out.println("形参："+ Arrays.toString(chars));
        chars[0] = 'a';
        System.out.println("形参："+ Arrays.toString(chars));
    }
}

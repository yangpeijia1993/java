package com.perlina.java.foundational.syntax.variable;

/**
 * 变量的定义和使用
 *
 * @author: Perlina
 * @version:2021/8/2111:30 AM
 */
public class Variable {
    public static void main(String[] args) {
        // 数据类型 变量名 = 变量值；
        // 定义的时候初始化赋值
        int age = 28;
        System.out.println(age);

        age = 30;
        System.out.println(age);

        // 先声明，后赋值
        //main方法中的变量都是局部变量，需要赋值后才能使用
        //同一个作用域内，不能重复定义同一个变量
        String name;
        name = "perlina";
        System.out.println(name);


    }
}

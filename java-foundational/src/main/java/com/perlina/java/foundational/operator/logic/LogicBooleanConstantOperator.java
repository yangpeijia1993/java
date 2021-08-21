package com.perlina.java.foundational.operator.logic;

/**
 * 逻辑运算符
 *
 * @author: Perlina
 * @version:2021/8/215:00 PM
 */
public class LogicBooleanConstantOperator {
    public static void main(String[] args) {
        //逻辑与
        System.out.println(true & true);
        System.out.println(true & false);

        //逻辑或
        System.out.println(true | false);

        //逻辑异或
        System.out.println(true ^ true);

        //逻辑非
        System.out.println(! true);
        System.out.println(!! true);

    }
}

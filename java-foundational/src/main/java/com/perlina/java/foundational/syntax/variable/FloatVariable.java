package com.perlina.java.foundational.syntax.variable;

/**
 * 浮点数表示方式
 *
 * @author: Perlina
 * @version:2021/8/2111:44 AM
 */
public class FloatVariable {
    public static void main(String[] args) {
        //浮点型表示
        float flaotVal = 3.14F;
        double doubleVal = 3.14;
        System.out.println(flaotVal);
        System.out.println(doubleVal);

        //浮点数科学计数
        double scVal = 314E-2;//除100，3.14
        System.out.println(scVal);

        double scVal2 = 1000.00E3;//乘3，1000000.0
        System.out.println(scVal2);

        //浮点数运算有精度损失
        System.out.println(2.0-1.1);//0.8999999999999999
    }
}

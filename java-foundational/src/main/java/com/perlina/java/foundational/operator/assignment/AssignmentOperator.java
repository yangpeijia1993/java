package com.perlina.java.foundational.operator.assignment;

/**
 * 赋值运算符
 *
 * @author: Perlina
 * @version:2021/8/214:35 PM
 */
public class AssignmentOperator {
    public static void main(String[] args) {
        //基本运算符
        int num = 10;

        //扩展运算符：+=，-=，*=，/=，%=
        int left = 20;
        int right = 3;

        left += right;//left = left+right
        System.out.println("left + right = "+left);

        //扩展赋值在赋值时会做类型转换
        byte leftByte = 10;
        byte rightByte = 20;
        //byte类型参与运算时，数据类型提升至int，所以需要强制转换
        byte resByte = (byte)(leftByte+rightByte);
        System.out.println(resByte);

        //自动进行了类型转换
        leftByte += rightByte;
        System.out.println(leftByte);
    }
}

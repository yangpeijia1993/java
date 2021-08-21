package com.perlina.java.foundational.syntax.conversion;

/**
 * 类型转换注意事项
 *
 * @author: Perlina
 * @version:2021/8/211:17 PM
 */
public class TypeConversionWarning {
    public static void main(String[] args) {
        //1、布尔类型不能和其他7中类型进行转换
        boolean flag = true;
//        int intVal = (int)flag;//编译错误
        //2、强制类型转换可能会造成精度损失

        //3、强制类型转换，可能会数据溢出
        byte byteVal = (byte)128;//byte:-128  -  127，128=127+1：-128，
        // 129=127+2：-127，依次推理
        byte byteVal1 = (byte)129;
        System.out.println(byteVal);
        System.out.println(byteVal1);

        //4、byte,short,char三种类型数据在运算时会先提升至int类型再进行计算
        //防止溢出
        char charA = 'A';
        System.out.println(charA+1);//66

        short shortN = 100;
        short shortM = 100;
//        short res = shortM + shortN; //运算结果已经是int
        int res = shortM + shortN;//获取使用强制转换为short
        short res1 = (short)(shortM+shortN);
        System.out.println(res);
    }
}

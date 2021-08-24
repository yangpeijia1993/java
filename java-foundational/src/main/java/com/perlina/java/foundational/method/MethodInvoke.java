package com.perlina.java.foundational.method;

/**
 * 有返回值的方法定义
 *
 * @author: Perlina
 * @version:2021/8/241:54 PM
 */
public class MethodInvoke {
    public static void main(String[] args) {

        int left = 10;
        int right = 20;
        //单独调用
        add(left,right);
        //输出调用
        System.out.println(add(left,right));
        //赋值调用
        int sum = add(left,right);
    }

    /**
     * 两个整数相加
     * @param left：第一个操作数
     * @param right：第二个操作数
     * @return：两数之和
     */
    public static int add(int left,int right){
        return left+right;
    }
}

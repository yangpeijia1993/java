package com.perlina.java.foundational.oop.innerclass;

/**
 * 静态内部类
 *
 * @author: Perlina
 * @version:2021/8/2611:31 上午
 */
public class StaticInnerClass {
    static int count = 10;


    static class InnerClass{
        static int count = 20;

        public void showStaticInnerClassInfo(int count){
            System.out.println("xingcan: "+count);
            System.out.println("Inner Class: "+ InnerClass.count);
            System.out.println("Out Class:"+ StaticInnerClass.count);
        }
    }
}

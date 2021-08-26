package com.perlina.java.foundational.oop.innerclass;

/**
 * 局部内部类
 *
 * @author: Perlina
 * @version:2021/8/2611:46 上午
 */
public class LocalInnerClass {
    public static void main(String[] args) {
        int number = 10;
        class InnerClass{
            private String name;

            InnerClass(String name) {
                this.name = name;
            }

            void showLocalInnerClassInfo(){
                System.out.println(this.name);
                //局部内部类中使用了方法中的变量，变量会变成final类型，修改会报错
                System.out.println("main方法中number"+ number);
            }
        }
        InnerClass inner= new InnerClass("局部内部类");
        inner.showLocalInnerClassInfo();
//        number = 20;
    }
}

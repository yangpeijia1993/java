package com.perlina.java.foundational.oop.innerclass;

/**
 * 静态内部类单例模式
 *
 * @author: Perlina
 * @version:2021/8/2611:37 上午
 */
public class StaticInnerClassSingleton {
    /**
     * 1。私有化构造器
     */

    private StaticInnerClassSingleton(){}

    public static StaticInnerClassSingleton getInstance(){
        return StaticInnerClassSingletonHolder.INSTANCE;
    }

    /**
     * 内部类中定一个final 的 对象
     */
    static class StaticInnerClassSingletonHolder{
        private static final StaticInnerClassSingleton INSTANCE = new StaticInnerClassSingleton();
    }
}

package com.perlina.java.foundational.oop.enums;

/**
 * 季节枚举测试
 *
 * @author: Perlina
 * @version:2021/8/262:50 下午
 */
public class SeasonTest {
    public static void main(String[] args) {
        Season spring = Season.SPRING;
        System.out.println(spring);

        spring = Season.getSeasonDiscription("春天");
        System.out.println(spring.getDescription());
    }
}

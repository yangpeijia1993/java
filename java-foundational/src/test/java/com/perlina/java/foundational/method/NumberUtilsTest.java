package com.perlina.java.foundational.method;

/**
 * 整数工具类测试
 *
 * @author: Perlina
 * @version:2021/8/242:14 PM
 */
public class NumberUtilsTest {
    public static void main(String[] args) {
        int left = 10;
        int right = 10;
        boolean result = NumberUtils.compare(left,right);
        System.out.println(result?"相等":"不等");

        int sum = NumberUtils.sum(1, 100);
        System.out.println(sum);
    }
}

package com.perlina.java.foundational.method;

/**
 * 整数方法
 *
 * @author: Perlina
 * @version:2021/8/242:08 PM
 */
public class NumberUtils {

    /**
     * 比较两个整数是否相等
     * @param left
     * @param right
     * @return
     */
    public static boolean compare(int left,int right) {
        return left == right;
    }


    /**
     * 指定范围的整数的和
     * @param start
     * @param end
     * @return
     */
    public static int sum(int start, int end){
        int result =0;
        for (int i=start; i<=end; i++){
            result += i;
        }
        return result;
    }
}

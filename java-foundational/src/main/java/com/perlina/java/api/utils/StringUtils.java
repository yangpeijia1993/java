package com.perlina.java.api.utils;

/**
 * 字符串工具类
 *
 * @author: Perlina
 * @version:2021/8/274:52 下午
 */
public class StringUtils {

    /**
     * 字符串翻转
     * @param str
     * @return
     */
    public static String reverse(String str){
        if (str == null){
            return null;
        }
        return new StringBuilder(str).reverse().toString();
    }

    /**
     * 数组转字符串
     * @param array
     * @return
     */
    public static String arrayToString(int[] array){
        if (null == array){
            return "null";
        }
        int maxIndex = array.length-1;
        if (maxIndex == -1){
            return "[]";
        }
        StringBuilder str = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            if (i == maxIndex){
                str.append(array[i]).append("]");
            }else {
                str.append(array[i]).append(",");
            }
        }
        return str.toString();
    }
}

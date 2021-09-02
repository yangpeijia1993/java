package com.perlina.java.api.util;

import java.lang.reflect.AccessibleObject;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 字符串字符个数统计
 *
 * @author: Perlina
 * @version:2021/8/305:03 下午
 */
public class StringCharCount {
    public static void main(String[] args) {
        System.out.println("请输入字符串：");
        Scanner input = new Scanner(System.in);
        String str = input.next();

        Map<Character,Integer> charMap = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            if (charMap.containsKey(ch)){
                Integer countValue = charMap.get(ch);
                countValue++;
                charMap.put(ch,countValue);
            }else {
                charMap.put(ch,1);
            }
        }
        System.out.println(charMap);
    }
}

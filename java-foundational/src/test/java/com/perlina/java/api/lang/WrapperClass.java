package com.perlina.java.api.lang;

import org.testng.annotations.Test;

/**
 * 转换测试
 *
 * @author: Perlina
 * @version:2021/8/269:56 下午
 */
public class WrapperClass {

    /**
     * 将字符串转换为integer
     */
    @Test
    public void testStringToInteger(){
        String str = "100";
        Integer value = Integer.parseInt(str);
        System.out.println(value instanceof Integer);
    }

    /**
     * 将int 转换为 Integer
     */
    @Test
    public void testIntToInteger(){
        int number = 10;
        Integer value = Integer.valueOf(10);
        System.out.println(value instanceof Integer);
    }

    /**
     * 测试Integer缓存
     * == 表示比较地址
     * equals() 比较数值
     * 缓存范围 -128  -  127
     */
    @Test
    public void testIntegerCache(){
        int value = 127;
        Integer source = Integer.valueOf(value);
        Integer target = Integer.valueOf(value);
        System.out.println(source == target);

        value =128;
        source = Integer.valueOf(value);
        target = Integer.valueOf(value);
        System.out.println(source == target);
    }

    /**
     * 自动拆箱和自动装箱
     */
    @Test
    public void testAutoBox(){
        int number =10;
        //自动装箱
        Integer value = number;
        System.out.println(value);
        System.out.println(value instanceof Integer);
        //自动拆箱
        number = value;

        System.out.println(number);
    }

    /**
     * 大小写转换
     */
    @Test
    public void testCharacterToUpperLower(){
        char lower = 'a';
        System.out.println(Character.toUpperCase(lower));

        char upper = 'A';
        System.out.println(Character.toLowerCase(upper));
    }

    /**
     * 大小写字母的判断
     */
    @Test
    public void testCharacterIsUpperLower(){
        char lower = 'a';
        System.out.println(Character.isLowerCase(lower));

        char upper = 'A';
        System.out.println(Character.isUpperCase(upper));
    }

    /**
     * 字符数组中指定索引Unicode编码
     */
    @Test
    public void testCharacterCodePointAt(){
        char[] ch = {'a','中'};
        int unicode = Character.codePointAt(ch, 1);
        System.out.println(unicode);
    }
}

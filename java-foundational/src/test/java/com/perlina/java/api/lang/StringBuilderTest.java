package com.perlina.java.api.lang;

import org.testng.annotations.Test;

/**
 * StringBuilder测试方法
 *
 * @author: Perlina
 * @version:2021/8/274:43 下午
 */
public class StringBuilderTest {

    /**
     * 构造方法两种方式
     */
    @Test
    public void testStringBuilderConstructor(){
        StringBuilder str = new StringBuilder();
        System.out.println(str.length());

        str = new StringBuilder("hahhh");
        System.out.println(str.length());
    }

    /**
     * append()方法测试
     * append()在进行数据拼接时，返回当前同StringBuilder对象，无论拼接多少次
     * @see StringBuilder#append(String)
     */
    @Test
    public void testStringBuilderAppend(){
        StringBuilder str = new StringBuilder();
        StringBuilder one = str.append("ni");
        StringBuilder two = str.append("hao");

        System.out.println(str);//nihao
        System.out.println(one == two);//true
        System.out.println(one.equals(two));//true
        //链式编程

        System.out.println(str.append("ma").append("?"));
    }

    /**
     * 字符串翻转
     * @see StringBuilder#reverse()
     */
    @Test
    public void testStringBuilderReverse(){
        String str = "nihaoma?";
        StringBuilder strr = new StringBuilder(str);
        strr.reverse();
        System.out.println(strr.toString());
    }

    /**
     * 字符串插入
     * @see StringBuilder#insert(int, String)
     */
    @Test
    public void testStringBuilderInsert(){
        String str = "nihaoma?";
        StringBuilder strr = new StringBuilder(str);

        strr.insert(2," ").insert(6," ");
        System.out.println(strr.toString());//ni hao ma?
    }

    /**
     * StringBuilder和String转换
     */
    @Test
    public void testStringBuilderToString(){
        String str = "nihaoma?";
        StringBuilder strr = new StringBuilder(str);

        strr.insert(2," ").insert(6," ");
        System.out.println(strr.toString());
    }

}

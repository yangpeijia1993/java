package com.perlina.java.api.lang;

import org.testng.annotations.Test;

import java.util.Arrays;

/**
 * String类测试
 *
 * @author: Perlina
 * @version:2021/8/2711:07 上午
 */
public class StringTest {

    /**
     * 字符串创建方式
     */
    @Test
    public void testStringInstance(){
        //方式1：直接赋值，字面量值
        String str1 = "abc";
        System.out.println("str1:"+str1);

        //方式2：使用指定的字符串来创建
        String str2 = new String("aaa");
        System.out.println("str2:"+str2);

        //方式3：使用字符数组创建
        char[] ch = {'q','q'};
        String str3 = new String(ch);
        System.out.println("str3:"+str3);

        //方式4：使用byte数组创建
        byte[] bytes = {65,66,67,68};
        String str4 = new String(bytes);
        System.out.println("str4:"+str4);
    }

    /**
     * 字符串常量相等比较
     */
    @Test
    public void testStringConstantEquals(){
        String str1 = "Hello";
        String str2 = "Hello";

        //Hello是常量，只会在常量池存一份
        System.out.println(str1==str2);//true
        System.out.println(str1.equals(str2));//true
    }

    /**
     * 字符串变量相等性比较
     */
    @Test
    public void testStringVariableEquals(){
        //只要new 就会开辟新的空间，地址值肯定不相等
        String str1 = new String("Hello");
        String str2 = new String("Hello");

        System.out.println(str1==str2);//false
        System.out.println(str1.equals(str2));//true
    }

    /**
     * 字符串常量和变量的比较
     */
    @Test
    public void testStringConstantVariableEquals(){
        String str1 = "Hello";
        String str2 = new String("Hello");

        System.out.println(str1==str2);//false
        System.out.println(str1.equals(str2));//true
    }

    /**
     * length()测试
     * @see String#length()
     */
    @Test
    public void testStringLength(){
        String str1 = "你好啊，hahahha ";
        System.out.println(str1.length());
    }

    /**
     * 字符串拼接，将指定字符串拼接到尾部，等价于+
     * @see String#concat(String)
     */
    @Test
    public void testStringConcat(){
        String str = "Hello";
        String strConcat = str.concat("World");
        System.out.println(str);//Hello
        System.out.println(strConcat);//HelloWorld

        String strPlus = str+"nihao";
        System.out.println(str);//Hello
        System.out.println(strPlus);//Hellonihao
    }

    /**
     * 获取指定索引的字符
     * @see String#charAt(int)
     */
    @Test
    public void testStringCharAt(){
        String str = "Hello World";
        System.out.println(str.charAt(0));//H
        System.out.println(str.charAt(1));//e
        System.out.println(str.charAt(str.length()-1));//d
    }

    /**
     * 字符串翻转测试
     */
    @Test
    public void testStringReverse(){
        String str = "asdfghjkl";
        String newStr = stringReverse(str);
        System.out.println(str);
        System.out.println(newStr);
    }

    /**
     * 字符串翻转方法
     * @return
     */
    public String stringReverse(String str){
        String newStr = "";
        for (int i = str.length()-1; i >=0 ; i--) {
                newStr += str.charAt(i);
        }
        return newStr;
    }

    /**
     * 字符数组转字符串测试
     */
    @Test
    public void testArrayToString(){
        int[] number = {1,2,34,5,5};
        String str = arrayToString(number);
        System.out.println(str);

    }

    /**
     * 将数组转为字符串
     * @param array
     * @return
     */
    public String arrayToString(int[] array){
        String str = "[";
        for (int i = 0; i < array.length ; i++) {
            if (i<array.length-1){
                str += array[i]+",";
            }else {
                str += array[i]+"]";
            }
        }
        return str;
    }

    /**
     * 获取子串在字符串中第一次出现的索引
     * @see String#indexOf(String)
     * @see String#indexOf(String, int) 根据第一次索引找下一次,会包含第int次
     */
    @Test
    public void testStringIndexOf(){
        String str = "Java_ab";
        String target = "a";
        int firstIndex = str.indexOf(target);
        System.out.println(firstIndex);//1

        int secondIndex = str.indexOf(target,firstIndex+1);
        System.out.println(secondIndex);//3
    }

    /**
     * 获取子串在字符串中最后一次出现的索引
     * @see String#lastIndexOf(String)
     */
    @Test
    public void testStringLastIndexOf(){
        String str = "Java_ab";
        String target = "a";

        int lastIndex = str.lastIndexOf(target);
        System.out.println(lastIndex);//5
    }

    /**
     * 字符串截取
     * @see String#substring(int) 从第几个索引开始截取到最后一个
     * @see String#substring(int, int) 开始结束索引指定范围，不包含结束索引
     */
    @Test
    public void testStringSubString(){
        String str = "Java_ab_momo_perlina";
        String substring = str.substring(3);
        System.out.println(substring);//a_ab_momo_perlina

        String substringByIndex = str.substring(3, 10);
        System.out.println(substringByIndex);//a_ab_mo
    }

    /**
     * 忽略大小写的比较内容
     * @see String#equalsIgnoreCase(String)
     */
    @Test
    public void testStringEqualsIgnoreCase(){
        String str1 = "Java_sjkDD";
        String str2 = "Java_sjkDd";

        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
    }

    /**
     * 字符串非空判断
     * 字符串空格判断
     */
    @Test
    public void testStringIsEmptyIsBlank(){
        String str1 = "";
        String str2 = null;
        String str3 = " ";

        System.out.println(str1.isEmpty());//true
        System.out.println(str3.isBlank());//空格，true
        System.out.println(str2.isEmpty());//空指针 java.lang.NullPointerException
    }

    /**
     * 判断字串是否包含在字符串中
     */
    @Test
    public void testStringContains(){
        String str1 = "Java_sjkDD";
        String str2 = "Java";
        System.out.println(str1.contains(str2));//true
    }

    /**
     * 字符串替换返回新字符串
     * 通常和contains一起使用：密码替换
     */
    @Test
    public void testStringReplace(){
        String str1 = "password:666666";
        String str2 = "*";
        if (str1.contains("password")){
            String replace = str1.replace("6", str2);
            System.out.print(replace);//password:******
        }
    }

    /**
     * 以字串作为前缀/后缀 开头/结尾
     */
    @Test
    public void testStringStartWithEndWith(){
        String str1 = "Java_sjkDD";
        System.out.println(str1.startsWith("J"));//true
        System.out.println(str1.endsWith("D"));//true
    }

    /**
     * 字母的大小写转换
     */
    @Test
    public void testStringToUpperCaseLowerCase(){
        String str1 = "Java_sjkDD";
        System.out.println(str1.toUpperCase());//JAVA_SJKDD
        System.out.println(str1.toLowerCase());//java_sjkdd
    }

    /**
     * 字符串转换为字符数组和字节数组
     */
    @Test
    public void testStringToCharArrayByteArray(){
        String str1 = "Java_sjkDD";
        char[] chars = str1.toCharArray();
        for (char ch : chars) {
            System.out.print(ch+" ");//J a v a _ s j k D D
        }

        System.out.println();
        byte[] bytes = str1.getBytes();
        for (byte aByte : bytes) {
            System.out.print(aByte+" ");//74 97 118 97 95 115 106 107 68 68
        }
    }

    /**
     * 去除空格：去除前后，不能去除中间
     */
    @Test
    public void testStringTrim(){
        String str1 = " Java sjkDD ";
        String trim = str1.trim();
        System.out.println(trim);//Java sjkDD
    }

    /**
     * 按照指定规则切割字符串，返回字符串数组
     */
    @Test
    public void testStringSplit(){
        String str = "python,java,go,php";
        String[] split = str.split(",");
        System.out.println(Arrays.toString(split));

        str = "python.java.go.php";
        String[] split1 = str.split("\\.");
        System.out.println(Arrays.toString(split1));
    }
}

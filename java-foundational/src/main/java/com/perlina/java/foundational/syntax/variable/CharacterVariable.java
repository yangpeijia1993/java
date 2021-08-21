package com.perlina.java.foundational.syntax.variable;

/**
 * 字符类型表示
 *
 * @author: Perlina
 * @version:2021/8/2111:51 AM
 */
public class CharacterVariable {
    public static void main(String[] args) {
        char chVal = 'a';
        System.out.println(chVal);

        //字符a的unicode编码值就是97
        /**
         * A：65
         * 0：48
         * a：97
         */
        chVal = 97;
        System.out.println(chVal);

        //char可以存储unicode编码值
        char zero = '\u0000';
        System.out.println(zero);

        char chinese = '中';
        System.out.println(chinese);

        //转移字符
        char newLine = '\n';
        char path = '\\';
        char tab = '\t';
        System.out.println(newLine);
        System.out.println(path);
        System.out.println(tab);
    }
}

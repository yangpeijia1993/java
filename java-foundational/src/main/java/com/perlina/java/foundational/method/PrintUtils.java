package com.perlina.java.foundational.method;

/**
 * 打印工具类
 *
 * @author: Perlina
 * @version:2021/8/242:19 PM
 */
public class PrintUtils {

    /**
     * 不定次数和不定内容的打印方法
     * @param count：打印几次
     * @param content：打印内容
     */
    public static void printContent(int count,String content){
        if (count > 0){
            for (int i=0; i<count; i++){
                System.out.println(content);
            }
        }
        else{
            System.out.println("打印的次数必须要大于0");
        }
    }

    /**
     * 打印指定的类容
     * @param content
     */
    public static void printContent(String... content){
        for (int i=0; i<content.length; i++){
            System.out.println(content[i]);
        }
    }
}

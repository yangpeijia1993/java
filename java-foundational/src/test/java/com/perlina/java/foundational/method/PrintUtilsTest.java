package com.perlina.java.foundational.method;

/**
 * 打印工具类的测试
 * @author: Perlina
 * @version:2021/8/242:22 PM
 */
public class PrintUtilsTest {
    public static void main(String[] args) {
        PrintUtils.printContent(3,"hello");
        String[] books={"java","java1"};
        PrintUtils.printContent(books);
        PrintUtils.printContent("java2","java3");
    }
}

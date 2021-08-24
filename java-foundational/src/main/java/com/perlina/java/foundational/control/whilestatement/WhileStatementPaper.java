package com.perlina.java.foundational.control.whilestatement;

/**
 * 折纸案例
 *
 * @author: Perlina
 * @version:2021/8/229:53 AM
 */
public class WhileStatementPaper {
    public static void main(String[] args) {
        //珠穆朗玛峰8848.86米，一张纸的厚度是0.1毫米，折多少次超过珠峰高度
        int height = 88488600;
        int paperHeight = 1;

        //计数
        int count = 0;
        while (paperHeight<height){
            paperHeight *= 2;
            count++;
        }
        System.out.println("一共折了"+count+"次，最后纸厚度为："+paperHeight);
    }
}

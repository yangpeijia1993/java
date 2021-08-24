package com.perlina.java.foundational.control.forstatement;

/**
 * 显示时间
 *
 * @author: Perlina
 * @version:2021/8/2210:41 AM
 */
public class ForNestTime {
    public static void main(String[] args) {
        //展示24小时内时间时分，并计数
        int count = 0;
        for (int hour = 0; hour <= 23 ; hour++) {
            for (int min = 0; min <= 59 ; min++) {
                count++;
                System.out.print("现在是："+hour+"："+min+"\t"+"\t");
                if (count%5 == 0){
                    System.out.println();
                }
            }
        }
        System.out.println("一共打印了"+count+"次");
    }
}

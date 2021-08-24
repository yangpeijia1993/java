package com.perlina.java.foundational.control.forstatement;

/**
 * 显示时分秒
 *
 * @author: Perlina
 * @version:2021/8/2210:49 AM
 */
public class ForNestTimeSecond {
    public static void main(String[] args) {
        //展示12小时内时间时分秒，并计数
        int count = 0;
        for (int hour = 0; hour <= 12 ; hour++) {
            for (int min = 0; min <= 59 ; min++) {
                for (int second = 0; second <= 59 ; second++) {
                    count++;
                    System.out.print("现在是："+hour+"："+min+"："+second+"\t"+"\t");
                    if (count%5 == 0){
                        System.out.println();
                    }
                }

            }
        }
        System.out.println("一共打印了"+count+"次");
    }
}

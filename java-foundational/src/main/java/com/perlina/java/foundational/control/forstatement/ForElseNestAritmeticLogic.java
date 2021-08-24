package com.perlina.java.foundational.control.forstatement;

/**
 * 4位符合需求的数字
 *
 * @author: Perlina
 * @version:2021/8/2111:42 PM
 */
public class ForElseNestAritmeticLogic {
    public static void main(String[] args) {
        /**
         * 打印输出符合需求的4位整数
         个位+百位 = 十位+千位
         个位为偶数，千位为奇数
         打印符合条件的个数
         符合条件的数字，每行展示5个，用空格隔开
         */
        int count = 0;
        for (int i = 1000; i <9999 ; i++) {
            int unit = i%10;
            int ten = i/10%10;
            int hundred = i/100%10;
            int thousand = i/1000%10;

            if (unit+hundred == ten+thousand){
                if (unit%2==0 && thousand%2!=0){
                    count++;
                    System.out.print(i+" ");
                    if (count%5 == 0){
                        System.out.println();
                    }
                }
            }
        }
        System.out.println("个数："+count);
    }
}

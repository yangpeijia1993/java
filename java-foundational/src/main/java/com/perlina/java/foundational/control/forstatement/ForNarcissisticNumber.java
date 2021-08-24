package com.perlina.java.foundational.control.forstatement;

/**
 * 求水仙花数
 *
 * @author: Perlina
 * @version:2021/8/2111:36 PM
 */
public class ForNarcissisticNumber {
    public static void main(String[] args) {
        //求水仙花数（一个三位数，每个位上的数的3次幂等于她本身，153=1^3+5^3+3^3)
        //统计个数
        int count = 0;
        for (int i = 100; i <1000 ; i++) {
            int unit = i%10;
            int ten = i/10%10;
            int hundred = i/100%10;

            int value = unit*unit*unit+ten*ten*ten+hundred*hundred*hundred;
            if (value == i){
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println("水仙花数的个数是："+count);

    }
}

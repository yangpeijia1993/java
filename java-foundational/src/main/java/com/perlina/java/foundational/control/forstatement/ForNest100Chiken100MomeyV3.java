package com.perlina.java.foundational.control.forstatement;

/**
 * 百鸡百钱第一个版本
 *
 * @author: Perlina
 * @version:2021/8/2211:03 AM
 */
public class ForNest100Chiken100MomeyV3 {
    public static void main(String[] args) {
        /**
         * 花光100文钱买100只鸡
         公鸡5文，公鸡不超过20只
         母鸡3文，母鸡不超过33只
         小鸡1文钱3只，小鸡数量/3就是钱
         小鸡数量必须是3的倍数
         数量：100 = 公鸡数 + 母鸡数 + 小鸡数
         钱：  100 = 公鸡数*5 + 母鸡数*3 + 小鸡数/3
         */
        //一般业务只用两层循环
        System.out.println("公鸡数量\t公鸡单价\t母鸡数量\t母鸡单价\t小鸡数量\t小鸡单价\t");
        //公鸡
        int count = 0;
        for (int gj = 0; gj <= 20 ; gj++) {
            //母鸡
            for (int mj = 0; mj <= 33 ; mj++) {
                //小鸡
                int xj = 100 - gj - mj;
                if (xj%3 ==0  && gj+mj+xj == 100 && 5*gj+3*mj+xj/3 == 100){
                    System.out.printf("%4d %6d %8d %6d %8d %8.2f \n",
                        gj,5,mj,3,xj,0.33);
                }
                count++;
            }
        }
        System.out.println("一共执行了"+count+"次");//714
    }
}

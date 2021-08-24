package com.perlina.java.foundational.control.forstatement;

/**
 * for循环结合continue模拟20层电梯，第4层不停的场景
 *
 * @author: Perlina
 * @version:2021/8/2212:49 AM
 */
public class ForContinueElevator {
    public static void main(String[] args) {
        int count = 0;
        for (int level = 1;level<=20;level++){
            if (level == 4){
                continue;
            }
            System.out.println("第"+level+"层到了");
            count++;
        }
        System.out.println("循环执行了"+count+"次");
    }
}

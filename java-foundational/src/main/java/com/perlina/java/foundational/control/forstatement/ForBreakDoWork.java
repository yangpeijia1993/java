package com.perlina.java.foundational.control.forstatement;

/**
 * for循环结合break实现20-65岁工作
 *
 * @author: Perlina
 * @version:2021/8/2212:44 AM
 */
public class ForBreakDoWork {
    public static void main(String[] args) {
        int count = 0;
        for (int age = 0; age <=100 ; age++) {
            if (age==65){
                System.out.println(age+"退休了");
                break;
            }
            if (age>=20){
                System.out.println(age+"正在工作");
                count++;
            }
        }
        System.out.println("循环执行了"+count+"次");
    }
}

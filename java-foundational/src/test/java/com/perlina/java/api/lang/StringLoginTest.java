package com.perlina.java.api.lang;

import java.util.Scanner;

/**
 * 登陆案例
 *
 * @author: Perlina
 * @version:2021/8/2711:46 上午
 */
public class StringLoginTest {
    //输入用户名和密码，如果正确就登陆成功，否则就登陆失败（最多登陆三次）
    private static final String userName = "perlina";
    private static final String password = "666666";
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        testLogin(3);
    }

    public static void testLogin(int loginCounts){
        for (int i = loginCounts-1; i >= 0; i--) {
            System.out.println("请输入用户名：");
            String username = input.next();

            System.out.println("请输入密码：");
            String password = input.next();

            if (username.equals(StringLoginTest.userName) && password.equals(StringLoginTest.password)){
                System.out.println("登陆成功");
                break;
            }else{
                if (i==0){
                    break;
                }
                System.out.println("您还有"+i+"次机会，请重新输入");
            }
        }
    }
}

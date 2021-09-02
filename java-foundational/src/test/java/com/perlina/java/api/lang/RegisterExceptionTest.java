package com.perlina.java.api.lang;

import java.util.Scanner;

/**
 * 注册异常测试
 *
 * @author: Perlina
 * @version:2021/9/211:35 上午
 */
public class RegisterExceptionTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String name = input.next();
        if (name.equals("tom")){
            try {
                throw new RegisterException("用户已存在");
            } catch (RegisterException e) {
                e.printStackTrace();
                System.out.println("请重新输入用户名：");
            } finally {
                input.close();
            }
        }else {
            System.out.println("请输出密码进行下一步：");
        }
    }
}

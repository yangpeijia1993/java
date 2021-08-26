package com.perlina.java.foundational.oop.interfaces.server.impl;

import com.perlina.java.foundational.oop.interfaces.server.UserService;

/**
 * 用户服务测试
 *
 * @author: Perlina
 * @version:2021/8/269:24 上午
 */
public class UserServiceTest {
    public static void main(String[] args) {
        //接口多态
        UserService userService = new PCUserServiceImpl();
        userService.login();

        //引用类型转型
        userService = new AndriodUserServiceImpl();
        userService.login();

        if (userService instanceof AndriodUserServiceImpl){
            AndriodUserServiceImpl androidUserService = (AndriodUserServiceImpl)userService;
            androidUserService.getDevicesInfo();
        }
    }
}

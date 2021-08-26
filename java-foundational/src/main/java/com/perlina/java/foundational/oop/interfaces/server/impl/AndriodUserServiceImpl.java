package com.perlina.java.foundational.oop.interfaces.server.impl;

/**
 * android服务
 *
 * @author: Perlina
 * @version:2021/8/258:25 PM
 */
public class AndriodUserServiceImpl extends APPUserServiceImpl {
    @Override
    public void login() {
        System.out.println("android app用户登陆成功");
    }

    @Override
    public void register() {
        System.out.println("android app用户注册成功");
    }

    public void getDevicesInfo(){
        System.out.println("android app信息");
    }
}

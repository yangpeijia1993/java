package com.perlina.java.foundational.oop.interfaces.server.impl;

import com.perlina.java.foundational.oop.interfaces.server.CommonUserServices;
import com.perlina.java.foundational.oop.interfaces.server.UserService;

/**
 * app实现类
 *
 * @author: Perlina
 * @version:2021/8/258:22 PM
 */
public class APPUserServiceImpl extends CommonUserServices implements UserService {
    @Override
    public void login() {
        System.out.println("app用户登陆成功");
    }

    @Override
    public void register() {
        System.out.println("app用户注册成功");
    }
}

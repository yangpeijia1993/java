package com.perlina.java.foundational.oop.interfaces.server.impl;

import com.perlina.java.foundational.oop.interfaces.server.CommonUserServices;
import com.perlina.java.foundational.oop.interfaces.server.LogService;
import com.perlina.java.foundational.oop.interfaces.server.UserService;

/**
 * 实现类
 *
 * @author: Perlina
 * @version:2021/8/256:38 PM
 */
public class PCUserServiceImpl extends CommonUserServices implements UserService,LogService{
    @Override
    public void register() {
        log();
        getSecurityService().securityCheck();
        boolean result = getValidationService().validation("perlinaa");
        if (result){
            System.out.println("PC用户注册成功");
        }else {
            System.out.println("用户名已存在，请重新输入");
        }

    }

    @Override
    public void login() {
        log();
        getSecurityService().securityCheck();
        System.out.println("PC用户登陆成功");
    }


    @Override
    public void log() {
        System.out.println("记录PC日志中————");
    }
}

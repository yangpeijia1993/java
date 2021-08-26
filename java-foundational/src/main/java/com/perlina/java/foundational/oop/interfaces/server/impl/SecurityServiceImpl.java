package com.perlina.java.foundational.oop.interfaces.server.impl;

import com.perlina.java.foundational.oop.interfaces.server.SecurityService;

/**
 * 网络安全实现类
 *
 * @author: Perlina
 * @version:2021/8/258:31 PM
 */
public class SecurityServiceImpl implements SecurityService {
    @Override
    public void securityCheck() {
        System.out.println("网络安全检查通过————");
    }
}

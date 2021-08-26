package com.perlina.java.foundational.oop.interfaces.server;

import com.perlina.java.foundational.oop.interfaces.server.impl.SecurityServiceImpl;
import com.perlina.java.foundational.oop.interfaces.server.impl.ValidationServiceImpl;

/**
 * 共同的用户服务类
 *
 * @author: Perlina
 * @version:2021/8/258:20 PM
 */
public class CommonUserServices {
    /**
     * 持有一个网络安全服务
     */
    protected final SecurityService securityService = new SecurityServiceImpl();

    protected final ValidationService validationService= new ValidationServiceImpl();


    /**
     * 获得一个网络安全对象
     * @return
     */
    public SecurityService getSecurityService() {
        return securityService;
    }

    /**
     * 一个校验用户名对象
     * @return
     */
    public ValidationService getValidationService() {
        return validationService;
    }
}

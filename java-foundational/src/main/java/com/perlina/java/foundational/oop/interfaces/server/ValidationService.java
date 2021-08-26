package com.perlina.java.foundational.oop.interfaces.server;

/**
 * 校验服务
 *
 * @author: Perlina
 * @version:2021/8/258:40 PM
 */
public interface ValidationService {

    /**
     * 校验用户名是否存在
     * @param userName
     * @return
     */
    boolean validation(String userName);
}

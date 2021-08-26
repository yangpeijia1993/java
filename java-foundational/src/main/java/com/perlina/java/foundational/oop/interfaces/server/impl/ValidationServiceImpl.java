package com.perlina.java.foundational.oop.interfaces.server.impl;

import com.perlina.java.foundational.oop.interfaces.server.ValidationService;

/**
 * 校验接口实现
 *
 * @author: Perlina
 * @version:2021/8/258:41 PM
 */
public class ValidationServiceImpl implements ValidationService {
    @Override
    public boolean validation(String userName) {
        if ("perlina".equals(userName)){
            return false;
        }
        return true;
    }
}

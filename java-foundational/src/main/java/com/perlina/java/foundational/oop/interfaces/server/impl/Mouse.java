package com.perlina.java.foundational.oop.interfaces.server.impl;

import com.perlina.java.foundational.oop.interfaces.server.USB;

/**
 * 鼠标
 *
 * @author: Perlina
 * @version:2021/8/269:39 上午
 */
public class Mouse implements USB {
    @Override
    public String getDevices() {
        return "鼠标";
    }
}

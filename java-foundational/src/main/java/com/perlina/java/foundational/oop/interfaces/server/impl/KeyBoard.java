package com.perlina.java.foundational.oop.interfaces.server.impl;

import com.perlina.java.foundational.oop.interfaces.server.USB;

/**
 * 键盘
 *
 * @author: Perlina
 * @version:2021/8/269:40 上午
 */
public class KeyBoard implements USB {
    @Override
    public String getDevices() {
        return "键盘";
    }
}

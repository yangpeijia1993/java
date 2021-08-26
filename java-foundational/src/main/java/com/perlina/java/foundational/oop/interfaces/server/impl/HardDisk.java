package com.perlina.java.foundational.oop.interfaces.server.impl;

import com.perlina.java.foundational.oop.interfaces.server.USB;

/**
 * 硬盘
 *
 * @author: Perlina
 * @version:2021/8/269:41 上午
 */
public class HardDisk  implements USB {
    @Override
    public String getDevices() {
        return "硬盘";
    }
}

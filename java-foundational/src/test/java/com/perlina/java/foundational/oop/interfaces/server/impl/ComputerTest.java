package com.perlina.java.foundational.oop.interfaces.server.impl;

import com.perlina.java.foundational.oop.interfaces.server.Computer;
import com.perlina.java.foundational.oop.interfaces.server.USB;

/**
 * USB接口测试
 *
 * @author: Perlina
 * @version:2021/8/269:42 上午
 */
public class ComputerTest {
    public static void main(String[] args) {
        Computer usb = new Computer();

        USB mouse = new Mouse();
        USB keyboard = new KeyBoard();
        USB hardDisk = new HardDisk();

        usb.showComputerUSBInfo(mouse,keyboard);
        usb.showComputerUSBInfo(keyboard,hardDisk);
    }
}

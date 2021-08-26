package com.perlina.java.foundational.oop.interfaces.server;

/**
 *
 * 电脑
 * @author: Perlina
 * @version:2021/8/269:35 上午
 */
public class Computer {
    public void showComputerUSBInfo(USB usb1, USB usb2){
        System.out.println("第一个usb接口："+usb1.getDevices());
        System.out.println("第二个usb接口："+usb2.getDevices());
    }
}

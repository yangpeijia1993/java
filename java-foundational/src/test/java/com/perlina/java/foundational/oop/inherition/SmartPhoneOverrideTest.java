package com.perlina.java.foundational.oop.inherition;

/**
 * 重写测试
 * @author: Perlina
 * @version:2021/8/2511:51 AM
 */
public class SmartPhoneOverrideTest {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();

        phone.sendMessage(123,"哈哈哈");
        phone.call(1234);
    }
}

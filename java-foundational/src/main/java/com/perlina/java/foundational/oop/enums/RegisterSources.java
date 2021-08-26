package com.perlina.java.foundational.oop.enums;

/**
 * 注册来源
 *
 * @author: Perlina
 * @version:2021/8/263:17 下午
 */
public enum RegisterSources {
    PC("PC"),IOS_APP("IOS客户端"),
    ANDROID_APP("安卓客户端"),UNKWON("未知来源客户端");

    private String description;

    RegisterSources(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "注册来源{" +
            "来源描述='" + description + '\'' +
            '}';
    }
}

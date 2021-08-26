package com.perlina.java.foundational.oop.interfaces.server;

/**
 * 回调
 *
 * @author: Perlina
 * @version:2021/8/2610:50 上午
 */
public interface DownloadCallback {
    void handleData(String urldata);
}

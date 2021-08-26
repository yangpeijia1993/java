package com.perlina.java.foundational.oop.interfaces.server.impl;

import com.perlina.java.foundational.oop.interfaces.server.DownloadCallback;

/**
 * 安装回调
 *
 * @author: Perlina
 * @version:2021/8/2610:54 上午
 */
public class InstallCallback implements DownloadCallback {
    @Override
    public void handleData(String urldata) {
        if ("IDEA.exe".equals(urldata)){
            System.out.println("下载的数据是"+urldata);
            System.out.println("IDEA.exe正在安装");
        }
    }
}

package com.perlina.java.foundational.oop.interfaces.server.impl;

import com.perlina.java.foundational.oop.interfaces.server.DownloadCallback;

/**
 * 打开回调
 *
 * @author: Perlina
 * @version:2021/8/2610:55 上午
 */
public class OpenCallback implements DownloadCallback {

    @Override
    public void handleData(String urldata) {
        if (urldata.contains(".pdf") || urldata.contains(".txt")){
            System.out.println("下载的文件是"+urldata);
            System.out.println("正在打开"+urldata);
        }
    }
}

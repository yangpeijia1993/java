package com.perlina.java.foundational.oop.interfaces.server;

/**
 * 迅雷
 *
 * @author: Perlina
 * @version:2021/8/2610:30 上午
 */
public class Thunder {
    public void handDownLoad(String url, DownloadCallback downloadCallback){
        System.out.println("解析地址："+url);
        System.out.println("下载中————");
        String data = "下载的文件.txt";
        downloadCallback.handleData(url);
    }
}

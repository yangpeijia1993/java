package com.perlina.java.foundational.oop.interfaces.server;

/**
 * 客户
 *
 * @author: Perlina
 * @version:2021/8/2610:29 上午
 */
public class Customer {
    private DownloadCallback downloadCallback;

    public Customer(DownloadCallback downloadCallback){
        this.downloadCallback = downloadCallback;
    }

    public void downloadData(String urldata){
        System.out.println("用户想要下载"+urldata);
        System.out.println("打开迅雷");
        Thunder thunder = new Thunder();
        thunder.handDownLoad(urldata,downloadCallback);
    }
}

package com.perlina.java.api.lang;

import org.testng.annotations.Test;

import java.io.IOException;

/**
 * ProcessHandle类测试用例
 *
 * @author: Perlina
 * @version:2021/8/269:23 下午
 */
public class ProcessHandleTest {
    Runtime runtime = Runtime.getRuntime();

    /**
     * 获取进程信息
     */
    @Test
    public void testGetProcessInfo(){
        String command = "pwd";
        try {
            Process calendarProcess = runtime.exec(command);
            ProcessHandle processHandle = calendarProcess.toHandle();
            System.out.println(command+"的进程是："+processHandle.pid());
            System.out.println(command+"的进程状态："+processHandle.isAlive());

            ProcessHandle.Info info = processHandle.info();
            //命令路径，如果没有指定，那么会在默认的路径下找
            System.out.println(command+"进程的完整命令："+info.command().get());
            //进程开始时间
            System.out.println(command+"进程的开始时间："+info.startInstant());
            //进程运行cpu
            System.out.println(command+"进程的运行时间："+info.totalCpuDuration());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

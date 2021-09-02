package com.perlina.java.api.lang;

import org.testng.annotations.Test;

import java.io.IOException;

/**
 * RunTime类测试用例
 *
 * @author: Perlina
 * @version:2021/8/269:11 下午
 */
public class RunTimeTest {
    private Runtime runtime = Runtime.getRuntime();
    /**
     * 通过RunTime获得java运行时的硬件信息
     */
    @Test
    public void testRunTimeHardware(){
        //Java虚拟机处理器:CPU
        System.out.println("可以Java虚拟机处理器:"+runtime.availableProcessors());
        //内存
        System.out.println("可以Java虚拟机最大："+runtime.maxMemory());
        System.out.println("可以Java虚拟机可用："+runtime.freeMemory());
        System.out.println("可以Java虚拟机总："+runtime.totalMemory());
    }

    /**
     * 打开应用程序
     */
    @Test
    public void testRunTimeExec(){
        try {
            //根据操作系统不同
            runtime.exec("cacl.dmg");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

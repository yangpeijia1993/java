package com.perlina.java.api.lang;

import org.testng.annotations.Test;

import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.Map;
import java.util.Properties;

/**
 * System类方法的测试用例
 *
 * @author: Perlina
 * @version:2021/8/266:38 下午
 */
public class SystemTest {

    @Test
    public void testCurrentTimeMillis(){
        long startTime = System.currentTimeMillis();

        try{
            Thread.sleep(2000);
        }catch (Exception e){
            e.printStackTrace();
        }

        long endTime = System.currentTimeMillis();
        long time = endTime - startTime;

        System.out.println("开始时间："+startTime+"，结束时间："+endTime
        +"一共耗时："+time);
    }

    /**
     * 获取环境变量
     */
    @Test
    public void testSystemGetEnv(){
        Map<String, String> env = System.getenv();
        for (String key : env.keySet()) {
            System.out.println("key:"+key+",value:"+env.get(key));
        }
    }

    /**
     * 获取指定的环境变量名
     */
    @Test
    public void testSystemGetEnvByName(){
        System.out.println(System.getenv("PATH"));
        System.out.println(System.getenv("MAVEN_HOME"));
    }

    /**
     * 系统属性
     */
    @Test
    public void testSystemProperties(){
        Properties properties = System.getProperties();
        try {
            properties.store(new FileOutputStream("system_properties.txt"),"Mac System Properties");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * 获取系统属性
     */
    @Test
    public void testSystemGetProperties(){
        //操作系统
        System.out.println(System.getProperty("os.name"));
        //换行操作符
        System.out.println(System.getProperty("line.separator"));
        //文件编码
        System.out.println(System.getProperty("file.encoding"));
        //Java版本
        System.out.println(System.getProperty("java.version"));
        //class版本
        System.out.println(System.getProperty("java.class.version"));
        //虚拟机
        System.out.println(System.getProperty("java.vm.name"));
    }

    @Test
    public void testSystemExit(){
        /**
         * 0:正常退出
         * 非0：异常退出
         */
        System.exit(0);
        System.out.println("hahah ");//此方法不会被执行
    }

    /**
     * 数组复制
     */
    @Test
    public void testSystemArrayCopy(){
        int[] src = {1,2,3,4,5,6,7,8,9};
        int[] dest = {100,200,300,400,500,600,700,800,900};
        //从原数组的第几个下标开始，到新数组的第及格开始，复制几个
        System.arraycopy(src,2,dest,5,3);
        System.out.println(Arrays.toString(src));
        System.out.println(Arrays.toString(dest));
    }
}

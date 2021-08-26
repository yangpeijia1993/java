package com.perlina.java.foundational.oop.interfaces.server;

/**
 * 用户服务接口
 *
 * @author: Perlina
 * @version:2021/8/256:23 PM
 */
public interface UserService extends LoginService,RegisterService{
    /**
     * 常量：网站名称
     */
    String WEB_SITE_NAME= "淘宝";

    /**
     * 登陆：抽象方法
     */
    void login();

    /**
     *重制密码：默认
     */
    default void resetPassword(){
        System.out.println("请输入手机号并发送验证吗");
        System.out.println("输入新验证码");
        System.out.println("输入新的验证码");
        System.out.println("确认密码");
        System.out.println("提交");
    };

    /**
     * 统计注册人数：静态
     */
    static void statistics(){
        System.out.println("统计注册人数");
    }

    /**
     * 发送验证码：私有
     * jdk9
     */
    private void sendCode(){
        System.out.println("您的验证码是");
    }


    /**
     * 从数据库中查询所有用户信息：私有静态方法
     * @return
     * jdk9
     */
    private static long getAllUserInfo(){
        System.out.println("从数据库中查询所有的用户信息");
        int count = 100_000_000;
        return count;
    }

}

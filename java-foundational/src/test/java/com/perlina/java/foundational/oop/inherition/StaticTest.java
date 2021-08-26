package com.perlina.java.foundational.oop.inherition;

/**
 * static测试
 *
 * @author: Perlina
 * @version:2021/8/255:56 PM
 */
public class StaticTest {
    public static void main(String[] args) {
        RegisterInfo android = new RegisterInfo("安卓","app");
        System.out.println(android);

        RegisterInfo ios = new RegisterInfo();
        ios.setName("ios");
        System.out.println(ios);
    }
}

class RegisterInfo{
    private String name;

    private static String source;

    static {
        System.out.println("静态代码块执行");
    }

    public RegisterInfo() {
    }

    public RegisterInfo(String name, String source) {
        this.name = name;
        this.source = source;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public String toString() {
        return "注册信息{" +
            "姓名='" + name + '\'' +
            ", 来源='" + source + '\'' +
            '}';
    }
}
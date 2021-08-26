package com.perlina.java.foundational.oop;

/**
 * 代码块测试
 *
 * @author: Perlina
 * @version:2021/8/255:34 PM
 */
public class CodeBlockTest {
    public static void main(String[] args) {

        House house = new House(new Window("window3"));
        System.out.println(Window.getWindowCount());

    }
}

class House{
    static Window window1;
    Window window2;
    Window window3;

    {
        System.out.println("在构造代码块中初始化一块窗户windwow2");
        window2 = new Window("window2");
        System.out.println(window2);

    }

    //静态代码块
    static {
        System.out.println("静态代码块中初始化window1");
        window1 = new Window("window1");
        System.out.println(window1);
    }

    public House(){

    }

    public House(Window window3){
        this.window3 = window3;
        System.out.println("构造方法中初始化window3");
        System.out.println(this.window3);
    }




}

class Window{
    private static int windowCount;

    private String name;

    public Window(String name) {
        this.name = name;
    }

    public Window() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    //构造代码块
    {
        windowCount++;
    }

    public static int getWindowCount() {
        return windowCount;
    }

    public static void setWindowCount(int windowCount) {
        Window.windowCount = windowCount;
    }

    @Override
    public String toString() {
        return "房屋的窗户信息{" +
            "名称='" + name + '\'' +
            '}';
    }
}

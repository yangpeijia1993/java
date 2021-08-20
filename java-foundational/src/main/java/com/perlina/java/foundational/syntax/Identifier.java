//包名：全小写
package com.perlina.java.foundational.syntax;

/**
 * 标识符
 *
 * @author: Perlina
 * @version:2021/8/2112:35 AM
 */
public class Identifier {
    /**
     包名
     类名
     方法名
     常量名
     变量名

     命名规则
     不能以数字开头，但是可以包含数字，下划线，字母等
     不能使用关键字，但是可以包含关键字
     命名规范
     包名：全小写
     类名：大驼峰
     方法名，变量名：小驼峰
     常量名：全大写，下划线隔开各个单词
     见名知意
     */
    //常量名：全大写，下划线隔开各个单词
    public final String VERIFY_CODE = "111111";
    //变量名：小驼峰
    public int idCode;

}

/**
 * 大驼峰
 */
class UserInfo{
    //方法名：小驼峰
    public void getId(){

    }
}
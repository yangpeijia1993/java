package com.perlina.java.foundational.oop.innerclass;

/**
 * 成员内部类测试
 *
 * @author: Perlina
 * @version:2021/8/2611:21 上午
 */
public class MemberInnerClassTest {
    public static void main(String[] args) {
        //外部类
        MemberInnerClass memberInnerClass = new MemberInnerClass("外部类");
        MemberInnerClass.InnerClass innerClass = memberInnerClass.new InnerClass("内部类");
        innerClass.showMemberInfo("形参");
    }
}

package com.perlina.java.foundational.oop.innerclass;

/**
 * 成员内部类
 *
 * @author: Perlina
 * @version:2021/8/2611:15 上午
 */
public class MemberInnerClass {
    private String name;

    public MemberInnerClass(String name) {
        this.name = name;
    }

    /**
     * 内部类
     */
    class InnerClass{
        private String name;

        public InnerClass(String name) {
            this.name = name;
        }

        public void showMemberInfo(String name){
            System.out.println("成员方法形参name："+name);
            System.out.println("内部类的name："+this.name);
            System.out.println("外部内的name："+ MemberInnerClass.this.name);
        }
    }


}

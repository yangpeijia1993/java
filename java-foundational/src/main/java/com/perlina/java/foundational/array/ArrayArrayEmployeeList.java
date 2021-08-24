package com.perlina.java.foundational.array;

/**
 * 二维数组的应用
 *
 * @author: Perlina
 * @version:2021/8/2412:48 PM
 */
public class ArrayArrayEmployeeList {
    public static void main(String[] args) {
        System.out.printf("%10s%10s\n","员工编号","员工姓名");
        String[][] employee = new String[][]{
            {"0x001","xiaohuang"},
            {"0x002","xiaohong"}
        };

        for (int i=0; i< employee.length; i++) {
            for (int j=0; j< employee[i].length; j++) {
                System.out.printf("%12s",employee[i][j]);
            }
            System.out.println();
        }
    }
}

package com.perlina.java.foundational.syntax.conversion;

/**
 * 自动数据类型转换
 *
 * @author: Perlina
 * @version:2021/8/2112:54 PM
 */
public class AutoConversion {
    public static void main(String[] args) {
        /**
         * 自动类型转换规则
         byte<short<int<long<float<double
         char<int<long<float<double
         */

        //获取float类型的最大值，用包装类
        float floMax = Float.MAX_VALUE;
        System.out.println("floMax:"+floMax);//科学计数

        //格式化输出
        System.out.printf("浮点类型输出表示：%.2f \n",floMax);

        //获取long类型最大值
        long longMax = Long.MAX_VALUE;
        System.out.println("longMax:"+longMax);

        //long转float
        long longVal = 100L;
        System.out.println(longVal);//100

        float floVal;
        //long自动转float
        floVal = longVal;
        System.out.println(floVal);//100.0


        //char自动转为int
        char charMax = Character.MAX_VALUE;
        char charMin = Character.MIN_VALUE;
        System.out.println("charMax:"+(int)charMax);
        System.out.println("charMin:"+(int)charMin);

        int intVal;
        intVal = charMax;
        System.out.println(intVal);

        //不能将int转为char
//        int intVal2 = 100;
//        charMin = intVal2; // 编译报错

        //不能将short和char进行自动转换
//        short shortVal = 100;
//        shortVal = charMax;
//        charMax = shortVal;
    }
}

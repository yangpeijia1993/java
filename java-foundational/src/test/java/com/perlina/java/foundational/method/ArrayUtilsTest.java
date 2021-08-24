package com.perlina.java.foundational.method;

import java.util.Arrays;

/**
 * 数组工具类的测试
 *
 * @author: Perlina
 * @version:2021/8/242:33 PM
 */
public class ArrayUtilsTest {
    public static void main(String[] args) {
//        int[] number = new int[]{22,100,95,21,85,12,75,65,33,109,37};
////        ArrayUtils.bubbleSort(number);
//        int[] number1 = new int[]{12, 21, 22, 33, 37, 65, 75, 85, 95, 100, 109};
//        ArrayUtils.selectSort(number);
//
//        int index = ArrayUtils.binarySearch(number,36);
//        if (index == -1){
//            System.out.println("nothing found");
//        }
//        else {
//            System.out.println("target index:"+index);
//        }
//        int[] addArray = new int[]{1,3,2};
//        int[] newAdd = ArrayUtils.add(addArray,5);
//        System.out.println(Arrays.toString(addArray));
//        System.out.println(Arrays.toString(newAdd));

        int[] removeArray = new int[]{1,3,2};
//        System.out.println(Arrays.toString(removeArray));
//        int[] newArray = ArrayUtils.remove(removeArray,0);
//        int[] newArray = ArrayUtils.removeEle(removeArray, 2);
        int[] newArray = ArrayUtils.add(removeArray, 0, 12);
        System.out.println(Arrays.toString(removeArray));
        System.out.println(Arrays.toString(newArray));

    }
}

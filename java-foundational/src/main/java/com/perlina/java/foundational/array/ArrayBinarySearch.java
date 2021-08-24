package com.perlina.java.foundational.array;

import java.util.Scanner;

/**
 * 二分查找
 *
 * @author: Perlina
 * @version:2021/8/2411:53 AM
 */
public class ArrayBinarySearch {
    public static void main(String[] args) {
        //二分查找
        int[] array = new int[]{12,21,22,33,37,65,75,85,95,100,109};

        Scanner input = new Scanner(System.in);
        System.out.println("请属于你要查找的数字：");
        int target = input.nextInt();

        //二分法查找
        int start = 0;
        int end = array.length-1;

        int targetIndex = -1;


        while (start <= end){
            int mid = start+ end/2;
            if (target > array[mid]){
                start = mid+1;
            }else if(target< array[mid]){
                end = mid-1;
            }else if (target == array[mid]){
                targetIndex = mid;
                break;
            }
        }

        if (targetIndex != -1){
            System.out.println("输入的数字是："+target+"，数组中存在，下标是："+targetIndex);
        }
        else{
            System.out.println("输入的数字是："+target+"，数组中不存在");

        }


    }
}

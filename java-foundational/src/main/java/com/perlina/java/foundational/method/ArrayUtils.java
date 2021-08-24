package com.perlina.java.foundational.method;

import java.util.Arrays;

/**
 * 数组的操作方法
 *
 * @author: Perlina
 * @version:2021/8/242:29 PM
 */
public class ArrayUtils {
    /**
     * 整数数组的冒泡排序
     * @param number
     */
    public static void bubbleSort(int[] number){
        for (int lun = 0; lun< number.length-1; lun++){
            for (int i =1; i < number.length-lun; i++){
                if (number[i-1]>number[i]){
                    number[i-1] = number[i-1]^number[i];
                    number[i] = number[i-1]^number[i];
                    number[i-1] = number[i-1]^number[i];
                }
            }
        }
        System.out.println(Arrays.toString(number));
    }

    /**
     * 整数数组的选择排序
     * @param number
     */
    public static void selectSort(int[] number){
        for (int lun = 0; lun<number.length-1; lun++){
            for (int i=lun+1; i< number.length; i++){
                if (number[i]<number[lun]){
                    number[i] = number[lun]^number[i];
                    number[lun] = number[lun]^number[i];
                    number[i] = number[lun]^number[i];
                }
            }
        }
        System.out.println(Arrays.toString(number));
    }

    /**
     * 数组的二分查找
     * @param number
     * @param target
     * @return
     */
    public static int binarySearch(int[] number,int target){
        int targetIndex = -1;
        int start = 0;
        int end = number.length-1;
        while(start <= end){
            int mid = (start + end)/2;
            if (target < number[mid]){
                end = mid-1;
            }
            else if (target > number[mid]){
                start = mid+1;
            }
            else if (target == number[mid]){
                targetIndex = mid;
                break;
            }
        }
        return targetIndex;
    }

    /**
     * 整数数组中添加元素
     * @param array
     * @param element
     * @return
     */
    public static int[] add(int[] array,int element){
        //非空校验
        if (null == array){
            return null;
        }

        //创建一个新数组
        int[] newArray = new int[array.length+1];

        //复制原数组
        for (int i=0;i<array.length; i++){
            newArray[i] = array[i];
        }

        //最后一位添加元素
        newArray[newArray.length-1] = element;
        return newArray;
    }

    /**
     * 向数组中指定位置添加指定的元素
     * @param array
     * @param index
     * @param element
     * @return
     */
    public static int[] add(int[] array,int index,int element){
        if (null == array){
            return null;
        }
        if (index<0 || index>array.length){
            return null;
        }

        //新数组
        int[] newArray = new int[array.length+1];
        newArray[index] = element;

        for (int i = 0; i < array.length; i++) {
            if (i < index){
                newArray[i] = array[i];
            }else{
                //为新增元素留一个位置
                newArray[i+1] = array[i];
            }
        }
        return newArray;
    }
    /**
     * 通过下标删除元素
     * @param array
     * @param index
     * @return
     */
    public static int[] remove(int[] array,int index){
        if (null == array){
            return null;
        }
        //校验索引合法
        if (index<0 || index>array.length-1){
            return null;
        }

        //创建新数组
        int[] newArray = new int[array.length-1];
        int newArrayIndex = 0;
        //如果原数组中的值不是要删除的这个值，那么将这个值添加到新数组中
        for (int i=0; i<array.length; i++){
            if (array[i] != array[index]){
                newArray[newArrayIndex] = array[i];
                newArrayIndex++;
            }
        }
        return newArray;
    }

    /**
     * 通过元素本身删除数组中元素
     * @param array
     * @param element
     * @return
     */
    public static int[] removeEle(int[] array,int element){
        if (null == array){
            return null;
        }

        int eleIndex = -1;
        for (int i=0; i<array.length; i++){
            if (array[i] == element){
                eleIndex = i;
            }
        }
        if (eleIndex == -1){
            return array;
        }

        int newArrayIndex = 0;
        int[] newArray = new int[array.length-1];
        for(int i=0; i<array.length; i++){
            if (i != eleIndex){
                newArray[newArrayIndex] = array[i];
                newArrayIndex++;
            }
        }
        return newArray;
    }
}

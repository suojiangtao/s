package com.sjt;

import javax.xml.bind.SchemaOutputResolver;

//二分查找
public class MyBinarySearchDemo {
    public static void main(String[] args) {
        Integer[] arr={1,2,3,4,5,6,7,8,9};
        Integer number=3;
        int index=binarySearChForIndex(arr,number);
        System.out.println(index );
    }

    //二分查找 用最大索引max和一个最小索引min 计算出他的中间索引mid，用mid的数值与需要查找的数字进行比较
    //如果查找的数字比得到mid数值小，那么向左查找 mid-1 和min 在此进行计算得到mid 依次查找
    //反之mid如果比查找的数字小 ，那么就向右查找 mid+1 和min 在进行比较  比较成功返回
    private static int binarySearChForIndex(Integer[] arr, Integer number) {
        int min=0;
        int max=arr.length-1;
        System.out.println("max"+max);
        //循环查找
        while (min<=max){
            //计算出mid
            int mid=(min+max) >> 1;
            //mid>number
            if (arr[mid] > number) {
                //查找的元素在左边
                max=mid-1;
            }else if(arr[mid]<number){
                min=mid+1;
            }else {
                return mid;
            }
            //mid<number
            //mid=number

        }
        return -1;

    }
}

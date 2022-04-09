package com.sjt;

public class MyBubbleSortDemo{
    public static void main(String[] args) {
        int []arr={3,5,2,1,4};
        for (int j = 0; j < arr.length-1; j++) {
            for (int i = 0; i < arr.length-1-j; i++) {
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }

        }
        getMethod(arr);
    }

    private static void getMethod(int[] arr) {
        for (int value : arr) {
            System.out.print(" " + value);
        }
    }
}

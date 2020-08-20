package com.vijay;

import java.util.Arrays;

public class UnsortedArray {
    private static Integer[] arr;
    private static int k;

    public static int kthSmallest(Integer[] arr, int k)
    {
        UnsortedArray.arr = arr;
        UnsortedArray.k = k;

        Arrays.sort(arr);

        return arr[k - 1];
    }


    public static void main(String[] args)
    {
        Integer arr[] = new Integer[] { 12, 3, 5, 7, 19 };
        int k = 2;
        System.out.print("Kth smallest element is " + kthSmallest(arr, k));
    }
}

package com.kavin.arrays.sort;

import java.util.Arrays;

public class MergeSortedArray_88 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3, n = 3;
        // Output [1,2,2,3,5,6]

        merge(nums1,m,nums2,n);
        System.out.println(Arrays.toString(nums1));
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2,0,nums1,m,n);
        for (int i = 0; i < nums1.length; i++)
            for (int j = 1; j < nums1.length ; j++)
                if (nums1[j] < nums1[j-1])
                    nums1[j] += nums1[j-1] - (nums1[j-1] = nums1[j]);
    }
}

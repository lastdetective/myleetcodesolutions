package com.leetcode.NO1To100.code088MergeSortedArray;

import org.junit.jupiter.api.Test;

class MergeSortedArrayTest {

    @Test
    void merge() {
        int m = 3;
        int n = 3;
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};

        // * Output: [1,2,2,3,5,6]
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        mergeSortedArray.merge(nums1, m, nums2, n);
        System.out.println(nums1.toString());
    }
}
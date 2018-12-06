package com.leetcode.No1To100.code004MedianofTwoSortedArrays;



/**
 * Created by Administrator on 2018/12/5.
 */
public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] sortedNums = new int[nums1.length + nums2.length];
        int i = 0, j = 0, k = 0;
        while (i != nums1.length && j != nums2.length) {
            if (nums1[i] < nums2[j]) {
                sortedNums[k++] = nums1[i++];
            } else {
                sortedNums[k++] = nums2[j++];
            }
        }
        while (i != nums1.length) {
            sortedNums[k++] = nums1[i++];
        }
        while (j != nums2.length) {
            sortedNums[k++] = nums2[j++];

        }
       // 0 1 2 4
     //   1 2 3 4
        double middle  ;
        int sortedNumsLength = sortedNums.length;
        if (sortedNums.length % 2 == 0) {
            middle = (sortedNums[sortedNumsLength / 2] + sortedNums[sortedNumsLength / 2 - 1]) / 2.0;
        } else {
            middle = sortedNums[sortedNumsLength / 2];
        }

        return middle;
    }

    public void testFindMedianSortedArrays() {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        findMedianSortedArrays(nums1, nums2);
    }

}

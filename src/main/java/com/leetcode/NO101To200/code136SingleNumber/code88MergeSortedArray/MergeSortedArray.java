package com.leetcode.NO101To200.code136SingleNumber.code88MergeSortedArray;

/*
 * @lc app=leetcode id=88 lang=java
 *
 * [88] Merge Sorted Array
 *
 * https://leetcode.com/problems/merge-sorted-array/description/
 *
 * algorithms
 * Easy (35.21%)
 * Total Accepted:    346.1K
 * Total Submissions: 981.5K
 * Testcase Example:  '[1,2,3,0,0,0]\n3\n[2,5,6]\n3'
 *
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as
 * one sorted array.
 *
 * Note:
 *
 *
 * The number of elements initialized in nums1 and nums2 are m and n
 * respectively.
 * You may assume that nums1 has enough space (size that is greater or equal to
 * m + n) to hold additional elements from nums2.
 *
 *
 * Example:
 *
 *
 * Input:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 *
 * Output: [1,2,2,3,5,6]
 *
 *
 */
public class MergeSortedArray {
    /**
     * solution 1
     * <p>
     * Example:
     * <p>
     * Input:
     * nums1 = [1,2,3,0,0,0], m = 3
     * nums2 = [2,5,6],       n = 3
     * <p>
     * Output: [1,2,2,3,5,6]
     *
     * @param nums1
     * @param m
     * @param nums2 public void merge(int[] nums1, int m, int[] nums2, int n) {
     *              int i = m - 1; // 2
     *              int j = n - 1; // 2
     *              int size = nums1.length - 1;
     *              while (size >= 0 && j >= 0) {//j >= 0 && i >= 0) {
     *              if (i >= 0 && nums1[i] > nums2[j]) {
     *              nums1[size] = nums1[i];
     *              i--;
     *              } else {
     *              nums1[size] = nums2[j];
     *              j--;
     *              }
     *              size--;
     *              }
     *              }
     *              </pre>
     */

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int size = nums1.length - 1;

        while (size >= 0 && j >= 0) {//j >= 0 && i >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[size] = nums1[i];
                i--;
            } else {
                nums1[size] = nums2[j];
                j--;
            }
            size--;
        }

    }

}

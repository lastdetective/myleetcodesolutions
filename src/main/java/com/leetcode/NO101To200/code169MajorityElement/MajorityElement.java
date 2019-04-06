package com.leetcode.NO101To200.code169MajorityElement;

import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=169 lang=java
 *
 * [169] Majority Element
 *
 * https://leetcode.com/problems/majority-element/description/
 *
 * algorithms
 * Easy (51.96%)
 * Total Accepted:    363.2K
 * Total Submissions: 698.9K
 * Testcase Example:  '[3,2,3]'
 *
 * Given an array of size n, find the majority element. The majority element is
 * the element that appears more than ⌊ n/2 ⌋ times.
 *
 * You may assume that the array is non-empty and the majority element always
 * exist in the array.
 *
 * Example 1:
 *
 *
 * Input: [3,2,3]
 * Output: 3
 *
 * Example 2:
 *
 *
 * Input: [2,2,1,1,1,2,2]
 * Output: 2
 *
 *
 */
class MajorityElement {
    public int majorityElement(int[] nums) {
        /**
         * my solution
         *
         * <pre>
         if (nums.length == 1) {
         return nums[0];
         }
         int halfSzie = nums.length / 2;
         Map<Integer, Integer> numMap = new HashMap<>();
         // Map<Integer, Integer> max = new HashMap<>();
         int maxNum = nums[0];
         int maxCount = 1;
         for (int i = 0; i < nums.length; i++) {
         if (numMap.containsKey(nums[i])) {
         int currentCount = numMap.get(nums[i]);
         numMap.put(nums[i], currentCount + 1);
         if (currentCount + 1 >= halfSzie && currentCount + 1 > maxCount) {
         maxNum = nums[i];
         maxCount = currentCount + 1;
         }
         } else {
         numMap.put(nums[i], 1);
         }

         }
         return maxNum;
         </pre>
         */

        /**
         * <pre>
         *     Approach 1: Brute Force
         * Intuition
         *
         * We can exhaust the search space in quadratic time by checking whether each element is the majority element.
         *
         * Algorithm
         *
         * The brute force algorithm iterates over the array, and then iterates again for each number to count its occurrences. As soon as a number is found to have appeared more than any other can possibly have appeared, return it.
         * </pre>
         */
        /*
        这个解法有问题
        比如输入 [6,6,6,7,7,7,7] 应该输出7
        但是这里输出 6
         */
        int majorityCount = nums.length / 2;

        for (int num : nums) {
            int count = 0;
            for (int elem : nums) {
                if (elem == num) {
                    count += 1;
                }
            }

            if (count >= majorityCount) {
                return num;
            }

        }

        return -1;
    }
}

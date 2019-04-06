package com.leetcode.NO101To200.code169MajorityElement;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

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
class MajorityElementTest {
    @Test
    public void majorityElementTest() {
        //int[] nums = {2, 2, 1, 1, 1, 2, 2};
        //int[] nums = {1};
        int[] nums = {6,6,6,7,7,7,7};
        //int[] nums = {6,5,5};
        MajorityElement majorityElement = new MajorityElement();
        int result = majorityElement.majorityElement(nums);
       // System.out.println(123121212);
        assertEquals(7, result);
    }
}

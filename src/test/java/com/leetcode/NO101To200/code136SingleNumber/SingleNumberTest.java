package com.leetcode.NO101To200.code136SingleNumber;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/*
 * @lc app=leetcode id=136 lang=java
 *
 * [136] Single Number
 *
 * https://leetcode.com/problems/single-number/description/
 *
 * algorithms
 * Easy (59.45%)
 * Total Accepted:    436.5K
 * Total Submissions: 734.1K
 * Testcase Example:  '[2,2,1]'
 *
 * Given a non-empty array of integers, every element appears twice except for
 * one. Find that single one.
 * 
 * Note:
 * 
 * Your algorithm should have a linear runtime complexity. Could you implement
 * it without using extra memory?
 * 
 * Example 1:
 * 
 * 
 * Input: [2,2,1]
 * Output: 1
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: [4,1,2,1,2]
 * Output: 4
 * 
 * 
 */

class SingleNumberTest {
    @Test
    public void testSingleNumber() {
        /*
         * a a b b c a a a a b b b b c c
         */
        SingleNumber singleNumber = new SingleNumber();
        int[] nums = { 1, 1, 3, 4, 2, 2, 3, 7, 4 };
        int result = singleNumber.singleNumber(nums);
        System.out.println(result);
        assertEquals(7, result);
    }
}

package com.leetcode.NO101To200.code136SingleNumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

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

class SingleNumber {
    public int singleNumber(int[] nums) {
        /**
         * solution 1 Approach 1: List operation Algorithm
         * 
         * Iterate over all the elements in \text{nums}nums If some number in
         * \text{nums}nums is new to array, append it If some number is already in the
         * array, remove it
         *
         * 
         * List<Integer> list = new ArrayList<>(); for (int i = 0; i < nums.length; i++)
         * { if (list.contains(nums[i])) { list.remove(new Integer(nums[i])); } else {
         * list.add(nums[i]); } } return list.get(0);
         */
        /**
         * <pre>
         * solution 2 Approach 2: Hash Table Algorithm
         * 
         * We use hash table to avoid the O(n)O(n) time required for searching the
         * elements.
         * 
         * Iterate through all elements in \text{nums}nums 
         * Try if hash\_tablehash_table
         * has the key for pop If not, set up key/value pair In the end, there is only
         * one element in hash\_tablehash_table, so use popitem to get it
         * 
         
        Map<Integer, Integer> integer = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (integer.containsKey(nums[i])) {
                integer.remove(nums[i]);
            } else {
                integer.put(nums[i], 1);
            }
        }
        Iterator<Integer> keys = integer.keySet().iterator();
        return keys.next();
         * </pre>
         */

        /**
         * <pre>
         * solution 3
         * Concept
         * 
         * 2 * (a + b + c) - (a + a + b + b + c) = c2∗(a+b+c)−(a+a+b+b+c)=c s = new
         * String[]{"A", "B", "C", "D","E"}; set = new HashSet<>(Arrays.asList(s));
         * System.out.println("set: " + set);
         *
        
        int originSum = 0;
        Set<Integer> integerSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            originSum += nums[i];
            integerSet.add(nums[i]);
        }
        Iterator<Integer> iterator = integerSet.iterator();
        int setSum = 0;
        while (iterator.hasNext()) {
            int temp = (Integer) iterator.next();
            setSum += temp;
        }
        return setSum * 2 - originSum;
         * </pre>
         */
        /**
         * <pre>
         * solution 4
         * Approach 4: Bit Manipulation
        Concept
        
        If we take XOR of zero and some bit, it will return that bit
        a \oplus 0 = aa⊕0=a
        If we take XOR of two same bits, it will return 0
        a \oplus a = 0a⊕a=0
        a \oplus b \oplus a = (a \oplus a) \oplus b = 0 \oplus b = ba⊕b⊕a=(a⊕a)⊕b=0⊕b=b
        So we can XOR all bits together to find the unique number.
         * </pre>
         */
        int a = 0;
        for (int i = 0; i < nums.length; i++) {
            a = a ^ nums[i];
        }
        return a;
    }
}

package com.leetcode.No1To100.code001TwoSum;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2018/12/4.
 */
public class TwoSum1 {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{
                        map.get(complement), i
                };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("没有符合要求的数字");

    }

    public static void main(String[] args) {
        int[] nums = {32, 52, 7, 1};
        int target = 8;
        int[] result = twoSum(nums, 8);
        System.out.println(result[0] + " " + result[1]);
    }
}

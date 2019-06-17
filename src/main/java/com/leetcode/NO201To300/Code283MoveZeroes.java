package com.leetcode.NO201To300;

import java.util.ArrayList;
import java.util.List;

public class Code283MoveZeroes {
    public void moveZeroes(int[] nums) {
       /*
        // 我的解法
        int zeroCount = 0;
        List<Integer> eles = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroCount++;
            } else {
                eles.add(nums[i]);
            }
        }
        for (int i = 0; i < zeroCount; i++) {
            eles.add(0);
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = eles.get(i);
        }*/
        if (nums == null || nums.length == 0) {
            return;
        }
        int insertPos = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[insertPos++] = num;
            }
        }
        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }

    }
}

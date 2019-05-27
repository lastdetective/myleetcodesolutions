package com.leetcode.NO101To200.code152MaximumProductSubarray;

public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
       /* int max = Integer.MIN_VALUE, imax = 1, imin = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                int tmp = imax;
                imax = imin;
                imin = tmp;
            }
            imax = Math.max(imax * nums[i], nums[i]);
            imin = Math.min(imin * nums[i], nums[i]);

            max = Math.max(max, imax);
        }
        return max;*/
        int result = Integer.MIN_VALUE, currentMax = 1, currentMin = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = currentMax;
                currentMax = currentMin;
                currentMin = temp;
            }
            currentMax = Math.max(nums[i], nums[i] * currentMax);
            currentMin = Math.min(nums[i], nums[i] * currentMin);
            result = Math.max(result, currentMax);
        }
        return result;
    }
}

package com.leetcode.NO101To200.code152MaximumProductSubarray;

import org.junit.jupiter.api.Test;

class MaximumProductSubarrayTest {

    @Test
    void maxProduct() {
        int[] nums = {1, 0, 4, 23, -6};
        MaximumProductSubarray o = new MaximumProductSubarray();
        int result = o.maxProduct(nums);
        System.out.println(result);

    }
}
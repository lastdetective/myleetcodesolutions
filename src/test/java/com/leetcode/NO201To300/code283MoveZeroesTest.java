package com.leetcode.NO201To300;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class code283MoveZeroesTest {

    @Test
    void moveZeroes() {
        Code283MoveZeroes c = new Code283MoveZeroes();
        int[] nums = {1, 2, 0, 0, 5};
        c.moveZeroes(nums);
    }
}
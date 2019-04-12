package com.leetcode.NO801To899.code887SuperEggDrop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SuperEggDropTest {

    @Test
    void superEggDrop() {
        int K = 5;
        int N = 100;
        SuperEggDrop superEggDrop = new SuperEggDrop();
        int result = superEggDrop.superEggDrop(K,N);
        System.out.println(
                result
        );
    }
}
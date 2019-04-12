package com.leetcode.NO101To200.code131PalindromePartitioning;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PalindromePartitioningTest {

    @Test
    void partition() {
        String s = "aab";
        PalindromePartitioning palindromePartitioning = new PalindromePartitioning();
        List<List<String>> lists = palindromePartitioning.partition(s);
        System.out.println(lists);
    }
}
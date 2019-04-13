package com.leetcode.NO101To200.code131PalindromePartitioning;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {
    List<List<String>> resultLst;
    ArrayList<String> currLst;

    public List<List<String>> partition(String s) {
        resultLst = new ArrayList<List<String>>();
        currLst = new ArrayList<String>();
        backTrack(s, 0);
        return resultLst;
    }

    public void backTrack(String s, int head) {
        if (currLst.size() > 0 //the initial str could be palindrome
                && head >= s.length()) {
            List<String> r = (ArrayList<String>) currLst.clone();
            resultLst.add(r);
        }
        for (int tail = head; tail < s.length(); tail++) {
            if (isPalindrome(s, head, tail)) {
                if (head == tail) {
                    currLst.add(Character.toString(s.charAt(tail)));
                } else {
                    currLst.add(s.substring(head, tail + 1));
                }

                backTrack(s, tail + 1);
                currLst.remove(currLst.size() - 1);
            }
        }
    }

    public boolean isPalindrome(String str, int l, int r) {
        if (l == r) return true;
        while (l < r) {
            if (str.charAt(l) != str.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }

}

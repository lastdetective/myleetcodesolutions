package com.leetcode.onetoten.code005LongestPalindromicSubstring;

import org.testng.annotations.Test;

import java.util.Map;

/**
 * 找出最长的回文子串
 */
public class LongestPalindromicSubstring {

    // 这种做法超时
    public String longestPalindrome(String s) {
        String resultString = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String tempString = s.substring(i, j);
                if (ifPalindromicString(tempString)) {
                    if (resultString.length() < tempString.length()) {
                        resultString = tempString;
                    }
                }
            }
        }
        return resultString;
    }

    /**
     * 判断是否是回文串
     * 1 2 3 4
     * 5
     * 4 3 2 1
     *
     * @param s
     * @return
     */
    public boolean ifPalindromicString(String s) {
        int halfIndex = s.length() / 2;
        int symmetricalIndex;

        for (int i = 0; i < s.length() / 2; i++) {
            if (s.length() % 2 == 0) {
                symmetricalIndex = i + (halfIndex - i) * 2 - 1;

            } else {
                symmetricalIndex = i + (halfIndex - i) * 2;
            }
            if (s.charAt(i) != s.charAt(symmetricalIndex)) {
                return false;
            }
        }
        return true;
    }

    @Test
    public void testLongestPalindrome() {
        String s = "abababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababa";
        System.out.println(longestPalindrome(s));
    }
}

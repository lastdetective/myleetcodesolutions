package com.leetcode.NO1To100.code005LongestPalindromicSubstring;



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
     * 动态规划
     *
     * @param s
     * @return
     */
    public String longestPalindromeDynamic(String s) {
        int maxPalindromicSubstringLength = 0;
        String maxPalindromicSubstring = "";
        if (s.isEmpty()) {
            return "";
        }
        boolean[][] substringPalindromeFlag = new boolean[s.length()][s.length()];
        for (int j = 0; j < s.length(); j++) {
            for (int i = 0; i <= j; i++) {
                boolean ijFlag = s.charAt(i) == s.charAt(j);
                substringPalindromeFlag[i][j] = j - i > 1 ? (substringPalindromeFlag[i + 1][j - 1] && ijFlag) : ijFlag;
                if (substringPalindromeFlag[i][j]) {
                    String tempString = s.substring(i, j + 1);
                    if (j - i + 1 > maxPalindromicSubstringLength) {
                        maxPalindromicSubstringLength = j - i + 1;
                        maxPalindromicSubstring = tempString;
                    }
                }
            }
        }

        return maxPalindromicSubstring;
    }


    /**
     * 判断是否是回文串
     *
     * @param s
     * @return
     */
    private boolean ifPalindromicString(String s) {
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

    public String longestPalindromeExpandAroundCenter(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);

    }

    private int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }

    public void testLongestPalindrome() {
        // String s = "abababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababa";

        String s = "cc12321c";
        System.out.println(longestPalindromeExpandAroundCenter(s));
    }
}

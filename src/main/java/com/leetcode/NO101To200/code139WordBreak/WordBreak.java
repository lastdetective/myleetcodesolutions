package com.leetcode.NO101To200.code139WordBreak;

import java.util.List;

/*139. Word Break
        Medium

        2029

        112

        Favorite

        Share
        Given a non-empty string s and a dictionary wordDict containing a list of non-empty words, determine if s can be segmented into a space-separated sequence of one or more dictionary words.

        Note:

        The same word in the dictionary may be reused multiple times in the segmentation.
        You may assume the dictionary does not contain duplicate words.
        Example 1:

        Input: s = "leetcode", wordDict = ["leet", "code"]
        Output: true
        Explanation: Return true because "leetcode" can be segmented as "leet code".
        Example 2:

        Input: s = "applepenapple", wordDict = ["apple", "pen"]
        Output: true
        Explanation: Return true because "applepenapple" can be segmented as "apple pen apple".
        Note that you are allowed to reuse a dictionary word.
        Example 3:

        Input: s = "catsandog", wordDict = ["cats", "dog", "sand", "and", "cat"]
        Output: false*/
// aabbc
// a b c aab

/**
 *
 */
public class WordBreak {
    private int result = 0;

    /**
     * 这种方法 总是不能 AC
     * 使用如下test case 大约耗时 500ms
     * "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab"
     * ["a","aa","aaa","aaaa","aaaaa","aaaaaa","aaaaaaa","aaaaaaaa","aaaaaaaaa","aaaaaaaaaa"]
     * private int result = 0;
     * <p>
     * public boolean wordBreak(String s, List<String> wordDict) {
     * getResult(s, wordDict);
     * if (result > 0) {
     * return true;
     * } else {
     * return false;
     * }
     * }
     * <p>
     * public void getResult(String s, List<String> wordDict) {
     * if (s.length() == 0) {
     * result++;
     * return;
     * // result.add((ArrayList<String>) current.clone());
     * }
     * for (int i = 0; i < wordDict.size(); i++) {
     * String word = wordDict.get(i);
     * if (s.startsWith(word)) {
     * // current.add(oneInDict);
     * getResult(s.substring(word.length()), wordDict);
     * // current.remove(current.size() - 1);
     * }
     * }
     * <p>
     * }
     **/
    /* 这种方法也不太好
    private static int count = 0;
    public boolean wordBreak(String s, List<String> wordDict) {
        getResult(s, wordDict);
        System.out.println(count);
        if (result > 0) {
            return true;
        } else {
            return false;
        }

    }

    public void getResult(String s, List<String> wordDict) {
        count++;
        if (s.length() == 0) {
            result++;
            return;
            // result.add((ArrayList<String>) current.clone());
        }
        for (int i = 0; i < wordDict.size(); i++) {
            if (s.length() >= wordDict.get(i).length()) {
                String tempString = s.substring(0, wordDict.get(i).length());
                if (wordDict.get(i).equals(tempString)) {
                    getResult(s.substring(tempString.length()), wordDict);
                }
            }
        }

    }*/
    public boolean wordBreak(String s, List<String> dict) {
        boolean[] f = new boolean[s.length() + 1];
        f[0] = true;


        // First DP
        for(int i = 1; i <= s.length(); i++){
            for(String str: dict){
                if(str.length() <= i){
                    if(f[i - str.length()]){
                        if(s.substring(i-str.length(), i).equals(str)){
                            f[i] = true;
                            break;
                        }
                    }
                }
            }
        }
        return f[s.length()];

        //Second DP
        /**********************************
         * l  e  e  t  c  o  d  e
         * 0  1  2  3  4  5  6  7  8
         * T  F  F  F  F  F  F  F  F
         * s.substring(0,4) = "leet"
         * f[0]=true && dict.contains("leet")
         *             ↓ f[4] = true;
         * T  F  F  F  T  F  F  F  F
         * s.substring(4,8) = "code"
         * f[4]=true && dict.contains("code")
         *             ↓ f[8] = true;
         * T  F  F  F  T  F  F  F  T
         *
         *
         *
        boolean[] f = new boolean[s.length() + 1];

        f[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                String tempString = s.substring(j, i);
                if (f[j] && dict.contains(tempString)) {
                    f[i] = true;
                    break;
                }
            }
        }
        return f[s.length()];
         */
    }
}




package com.leetcode.NO101To200.code139WordBreak;

import java.util.ArrayList;
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
public class WordBreak {
    private List<List<String>> result = new ArrayList<>();
    private ArrayList<String> current = new ArrayList<>();

    public boolean wordBreak(String s, List<String> wordDict) {
        getResult(s, wordDict);
        System.out.println("总共有" + result.size() + "个结果");
        for (int i = 0; i < result.size(); i++) {
            List<String> temp = result.get(i);
            System.out.println(temp);
        }
        if (result.size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void getResult(String s, List<String> wordDict) {
        if (s.length() == 0) {
            result.add((ArrayList<String>) current.clone());
        }
        for (int i = 0; i < wordDict.size(); i++) {
            if (s.indexOf(wordDict.get(i)) == 0) {
                String oneInDict = wordDict.get(i);
                current.add(oneInDict);
                getResult(s.substring(oneInDict.length()), wordDict);
                current.remove(current.size() - 1);
            }
        }

    }

}

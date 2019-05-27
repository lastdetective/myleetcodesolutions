package com.leetcode.NO101To200.code140WordBreakII;

import java.util.*;

public class WordBreakII {
    /*
    // 这个方法太挫了 差点把电脑累死
    private List<List<String>> resultList = new ArrayList<>();
    private ArrayList<String> current = new ArrayList<>();


    public List<String> wordBreak(String s, List<String> wordDict) {
        getResult(s, wordDict);
        List<String> result = new ArrayList<>();
        if (resultList.size() > 0) {
            for (int i = 0; i < resultList.size(); i++) {
                List<String> temp = resultList.get(i);
                if (temp != null && temp.size() > 0) {
                    String tempString = "";
                    for (int j = 0; j < temp.size(); j++) {

                        if (j == temp.size() - 1) {
                            tempString += temp.get(j);
                        } else {
                            tempString += temp.get(j) + " ";
                        }
                    }
                    result.add(tempString);
                }
            }
        }
        return result;
    }

    private void getResult(String s, List<String> wordDict) {
        if (s.length() == 0) {
            resultList.add((ArrayList<String>) current.clone());
            return;
        }
        for (int i = 0; i < wordDict.size(); i++) {
            String word = wordDict.get(i);
            if (s.startsWith(word)) {
                current.add(word);
                getResult(s.substring(word.length()), wordDict);
                current.remove(current.size() - 1);
            }
        }

    }
*/
    public List<String> wordBreak(String s, List<String> wordDict) {
        return DFS(s, wordDict, new HashMap<String, LinkedList<String>>());
    }

    // DFS function returns an array including all substrings derived from s.
    List<String> DFS(String s, List<String> wordDict, HashMap<String, LinkedList<String>> map) {
        if (map.containsKey(s))
            return map.get(s);

        LinkedList<String> res = new LinkedList<String>();
        if (s.length() == 0) {
            res.add("");
            return res;
        }
        for (String word : wordDict) {
            if (s.startsWith(word)) {
                List<String> sublist = DFS(s.substring(word.length()), wordDict, map);
                for (String sub : sublist)
                    res.add(word + (sub.isEmpty() ? "" : " ") + sub);
            }
        }
        map.put(s, res);
        return res;
    }
}

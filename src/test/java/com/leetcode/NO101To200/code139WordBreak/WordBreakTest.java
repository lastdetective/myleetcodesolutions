package com.leetcode.NO101To200.code139WordBreak;

import com.sun.org.apache.xerces.internal.xs.StringList;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordBreakTest {

    @Test
    void wordBreak() {
        // aabbc
        // a b c aab
       /* String s = "aabbc";
        String d1 = "a";
        String d2 = "b";
        String d3 = "c";
        String d4 = "aab";*/
        /**
         * "acaaaaabbbdbcccdcdaadcdccacbcccabbbbcdaaaaaadb"
         * ["abbcbda","cbdaaa","b","dadaaad","dccbbbc","dccadd","ccbdbc","bbca","bacbcdd","a","bacb","cbc","adc","c","cbdbcad","cdbab","db","abbcdbd","bcb","bbdab","aa","bcadb","bacbcb","ca","dbdabdb","ccd","acbb","bdc","acbccd","d","cccdcda","dcbd","cbccacd","ac","cca","aaddc","dccac","ccdc","bbbbcda","ba","adbcadb","dca","abd","bdbb","ddadbad","badb","ab","aaaaa","acba","abbb"]
         */
        String s = "acaaaaabbbdbcccdcdaadcdccacbcccabbbbcdaaaaaadb";
        List<String> dict = new ArrayList<>();
        String[] dicts = {"abbcbda", "cbdaaa", "b", "dadaaad", "dccbbbc", "dccadd", "ccbdbc", "bbca", "bacbcdd", "a", "bacb", "cbc", "adc", "c", "cbdbcad", "cdbab", "db", "abbcdbd", "bcb", "bbdab", "aa", "bcadb", "bacbcb", "ca", "dbdabdb", "ccd", "acbb", "bdc", "acbccd", "d", "cccdcda", "dcbd", "cbccacd", "ac", "cca", "aaddc", "dccac", "ccdc", "bbbbcda", "ba", "adbcadb", "dca", "abd", "bdbb", "ddadbad", "badb", "ab", "aaaaa", "acba", "abbb"};
        for (int i = 0; i < dicts.length; i++) {
            dict.add(dicts[i]);
        }
        WordBreak wordBreak = new WordBreak();
        long st = System.currentTimeMillis();
        boolean result = wordBreak.wordBreak(s, dict);
        long et = System.currentTimeMillis();
        System.out.println("耗时------> " + (et - st));
        assertEquals(result, true);
    }
}
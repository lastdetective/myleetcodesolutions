package com.leetcode.NO101To200.code140WordBreakII;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordBreakIITest {

    @Test
    void wordBreak() {

        //String s = "pineapplepenapple";
        //String[] wordDicts = {"apple", "pen", "applepen", "pine", "pineapple"};

        String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        String[] wordDicts = {"a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa", "aaaaaaa", "aaaaaaaa", "aaaaaaaaa", "aaaaaaaaaa"};
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < wordDicts.length; i++) {
            stringList.add(wordDicts[i]);
        }
        long st = System.currentTimeMillis();
        WordBreakII wordBreakII = new WordBreakII();
        List<String> resultList = wordBreakII.wordBreak(s, stringList);
        long et = System.currentTimeMillis();
        System.out.println("耗时------> " + (et - st));
        resultList.stream().forEach(item-> System.out.println(item));
    }
}
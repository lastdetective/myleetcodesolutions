package com.leetcode.No1To100.code006ZigZagConversion;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class ZigZagConversion {
    public String convert(String s, int rowNum) {
        if (rowNum == 1) {
            return s;
        }
        List<StringBuilder> resultList = new ArrayList<>();
        for (int i = 0; i < rowNum; i++) {
            resultList.add(new StringBuilder());
        }
        int curRow = 0;
        boolean goingDown = false;
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            resultList.get(curRow).append(chars[i]);
            if (curRow == 0 || curRow == rowNum - 1) {
                goingDown = !goingDown;
            }
            curRow += goingDown ? 1 : -1;
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < resultList.size(); i++) {
            result.append(resultList.get(i));
        }
        return result.toString();
    }
}

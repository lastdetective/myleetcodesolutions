package com.leetcode.NO101To200.code125ValidPalindrome;


import java.util.ArrayList;
import java.util.List;

/**
 * 125. Valid Palindrome
 * Easy
 * <p>
 * 548
 * <p>
 * 1571
 * <p>
 * Favorite
 * <p>
 * Share
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 * <p>
 * Note: For the purpose of this problem, we define empty string as valid palindrome.
 * <p>
 * Example 1:
 * <p>
 * Input: "A man, a plan, a canal: Panama"
 * Output: true
 * Example 2:
 * <p>
 * Input: "race a car"
 * Output: false
 */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        // 验证回文串
        char[] chars = s.toLowerCase().toCharArray();
        if (chars.length == 1) {
            return true;
        } else {

            List<Character> characters = new ArrayList<>();
            for (int i = 0; i < chars.length; i++) {
                if ((chars[i] >= 'a' && chars[i] <= 'z')
                        || (chars[i] >= '0' && chars[i] <= '9')
                ) {
                    characters.add(chars[i]);
                }
            }
            int head = 0;
            int tail = characters.size() - 1;
            while (tail >= head) {
                if (characters.get(tail) != characters.get(head)) {
                    return false;
                }
                head++;
                tail--;
            }
            return true;

        }

    }
}

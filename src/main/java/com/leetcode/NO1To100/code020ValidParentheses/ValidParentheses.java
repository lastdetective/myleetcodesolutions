package com.leetcode.NO1To100.code020ValidParentheses;

import com.sun.istack.internal.NotNull;
import org.junit.Test;

import java.util.HashMap;
import java.util.Stack;

/**
 * @author Bruce Liu
 * @version V1.0.0
 * @ClassName ValidParentheses
 * @Description
 * @date 2019-07-17 23:48
 */
public class ValidParentheses {
    private HashMap<Character, Character> mappings;

    private Stack<Character> stack = new Stack<>();

    public ValidParentheses() {
        mappings = new HashMap<>();
        mappings.put(')', '(');
        mappings.put(']', '[');
        mappings.put('}', '{');
    }

    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        for (char character : chars) {
            if (!stack.isEmpty() && (stack.peek().equals(mappings.get(character)))) {
                stack.pop();
            } else {
                stack.push(character);
            }
        }
        return stack.isEmpty();
    }

    public boolean isValid2(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    @Test
    public void testValidParentheses() {
        ValidParentheses validParentheses = new ValidParentheses();
        System.out.println(validParentheses.isValid("{[]}"));
    }
}

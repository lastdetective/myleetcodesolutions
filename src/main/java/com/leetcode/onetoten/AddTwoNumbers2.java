package com.leetcode.onetoten;


import org.testng.annotations.Test;

import java.lang.annotation.Native;
import java.util.ArrayList;
import java.util.List;

/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 * <p>
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * <p>
 * Example:
 * <p>
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * <p>
 * Output: 7 -> 0 -> 8
 * <p>
 * Explanation: 342 + 465 = 807.
 * <p>
 * Definition for singly-linked list.
 * <pre>
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 * <pre/>
 * @author Bruce Liu
 * @date 2018-12-04
 */
public class AddTwoNumbers2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        List<Integer> list1 = new ArrayList<Integer>();
        while (l1 != null) {
            list1.add(l1.val);
            l1 = l1.next;
        }

        List<Integer> list2 = new ArrayList<Integer>();
        while (l2 != null) {
            list2.add(l2.val);
            l2 = l2.next;
        }

        int nums1 = 0;
        int nums2 = 0;

        for (int i = 0; i < list1.size(); i++) {

            String temp = "1";
            for (int j = 0; j < i; j++) {
                temp += "0";
            }
            // 这里有可能会超过 int 的最大限制
            nums1 += list1.get(i) * Integer.parseInt(temp);
        }


        for (int i = 0; i < list2.size(); i++) {
            String temp = "1";
            for (int j = 0; j < i; j++) {
                temp += "0";
            }
            /**
             *
             * A constant holding the minimum value an {@code int} can
             * have, -2<sup>31</sup>.
             *
            @Native public static final int   MIN_VALUE = 0x80000000;

            /**
             * A constant holding the maximum value an {@code int} can
             * have, 2<sup>31</sup>-1.
             *
             @Native public static final int   MAX_VALUE = 0x7fffffff;

             */

            int afterParse = Integer.parseInt(temp);
            int int9 = list2.get(i);
            int increment = int9 * afterParse;
            nums2 += increment;
        }
        int result = nums1 + nums2;
        String resultString = result + "";
        char[] resultArray = resultString.toCharArray();
        List<ListNode> listNodes = new ArrayList<>();
        for (int i = resultArray.length - 1; i >= 0; i--) {
            Integer s = Integer.valueOf(String.valueOf(resultArray[i]));
            ListNode listNode = new ListNode(s);
            listNodes.add(listNode);
        }

        for (int i = 0; i < listNodes.size() - 1; i++) {
            listNodes.get(i).next = listNodes.get(i + 1);
        }
        ListNode listNode = listNodes.get(0);
        return listNode;
    }


    @Test
    public void testAddTwoNumbers() {
        /**
         * [9,9,9,9,9,9,9,9,9,9]
         [9,9,9,9,9,9,9,9,9,9]
         */
        ListNode l1a = new ListNode(1);
        ListNode l1b = new ListNode(4);
        ListNode l1c = new ListNode(3);

        ListNode l2a = new ListNode(2);
        ListNode l2b = new ListNode(4);
        ListNode l2c = new ListNode(7);

        l1b.next = l1c;
        l1a.next = l1b;

        l2b.next = l2c;
        l2a.next = l2b;

        // addTwoNumbers(l1a, l2a);
        int[] arr1 = {9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        int[] arr2 = {9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        ListNode listNode1 = generateSingleList(arr1);
        ListNode listNode2 = generateSingleList(arr2);
        addTwoNumbers(listNode1, listNode2);


    }

    public ListNode generateSingleList(int[] arrs) {
        List<ListNode> listNodes = new ArrayList<>();

        for (int i = 0; i < arrs.length; i++) {
            ListNode listNode = new ListNode(arrs[i]);
            listNodes.add(listNode);
        }
        for (int i = 0; i < listNodes.size() - 1; i++) {
            listNodes.get(i).next = listNodes.get(i + 1);
        }
        ListNode listNode = listNodes.get(0);
        return listNode;
    }
}

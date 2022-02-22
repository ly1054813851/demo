package com.example.java8test;

import java.util.*;

/**
 * @author：ly
 * @Data :09:50 2021/12/29
 **/
public class testset {
    public static void main(String[] args) {
        int k = 0;
        for(int i = 0; i<2; ++i){
            k = k+(2<<i);
            System.out.println(k);
        }

        //ListNode l = new ListNode(1,new ListNode(2,new ListNode(6,new ListNode(3,new ListNode(4,new ListNode(5,new ListNode(6)))))));
        //test(l,6);
        //System.out.println(a.val);
        //ListNode l = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5)))));
        //reverseList1(l);
        //teste1(l);

        //isValid("(]");
        //checkInclusion("ab","eidboaaboo");
    }

    //字符串排列
    public static boolean checkInclusion(String s1, String s2) {
        char[] pattern = s1.toCharArray();
        char[] text = s2.toCharArray();

        int pLen = s1.length();
        int tLen = s2.length();

        int[] pFreq = new int[26];
        int[] winFreq = new int[26];

        for (int i = 0; i < pLen; i++) {
            pFreq[pattern[i] - 'a']++;
        }

        int pCount = 0;
        for (int i = 0; i < 26; i++) {
            if (pFreq[i] > 0){
                pCount++;
            }
        }

        int left = 0;
        int right = 0;
        // 当滑动窗口中的某个字符个数与 s1 中对应相等的时候才计数
        int winCount = 0;
        while (right < tLen){
            if (pFreq[text[right] - 'a'] > 0 ) {
                winFreq[text[right] - 'a']++;
                if (winFreq[text[right] - 'a'] == pFreq[text[right] - 'a']){
                    winCount++;
                }
            }
            right++;

            while (pCount == winCount){
                if (right - left == pLen){
                    return true;
                }
                if (pFreq[text[left] - 'a'] > 0 ) {
                    winFreq[text[left] - 'a']--;
                    if (winFreq[text[left] - 'a'] < pFreq[text[left] - 'a']){
                        winCount--;
                    }
                }
                left++;
            }
        }
        return false;
    }

    //有效括号
    public static boolean isValid(String s) {
        int n = s.length();
        if (n % 2 == 1) {
            return false;
        }

        Map<Character, Character> pairs = new HashMap<Character, Character>() {{
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }};
        Deque<Character> stack = new LinkedList<Character>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (pairs.containsKey(ch)) {
                if (stack.isEmpty() || stack.peek() != pairs.get(ch)) {
                    return false;
                }
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }



    public static ListNode teste1(ListNode l) {
//        ListNode n = l;
//        ListNode p = null;
//        while (n!=null){
//            ListNode next = n.next;
//            n.next = p;
//            p = n;
//            n = next;
//        }
        if(l == null || l.next ==null){
            return l;
        }
        ListNode newHead = teste1(l.next);
        l.next.next = l;
        l.next = null;
        return newHead;

    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newHead = new ListNode(-1);
        ListNode p = newHead;
        while (list1!=null && list2!=null){
            if(list1.val<= list2.val){
                p = list1;
                list1 = list1.next;
            }else {
                p = list2;
                list2 = list2.next;
            }
        }
        p.next = list1==null?list2:list1;
        return newHead;
    }

    public static ListNode test(ListNode head, int val){
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode temp = dummyHead;
        while (temp.next != null) {
            if (temp.next.val == val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        return dummyHead.next;
    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static ListNode reverseList1(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverseList1(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }



}


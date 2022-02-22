package com.example.java8test;

/**
 * @author：ly
 * @Data :10:11 2021/12/27
 **/
public class ListNode {
    int val;
    ListNode next;

    ListNode() {

    }
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val; this.next = next;
    }
}

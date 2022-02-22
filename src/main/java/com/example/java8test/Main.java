package com.example.java8test;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author：ly
 * @Data :15:25 2021/12/26
 **/
public class Main {
    public static ListNode middleNode(ListNode head) {
        ListNode[] A = new ListNode[100];
        int t = 0;
        while (head != null) {
            A[t++] = head;
            head = head.next;
        }
        return A[t / 2];
    }
    public static void main(String[] args) {
        middleNode(new ListNode());

        List<String> list = new List<String>() {
        }
    }
}

package com.ekiras.ds.lists;

import com.ekiras.ds.base.ListNode;

public class MiddleElement {

    public static void main(String[] args) {
        ListNode list = new ListNode(1);
        list.next = new ListNode(2);
        list.next.next = new ListNode(3);
        list.next.next.next = new ListNode(4);
        list.next.next.next.next = new ListNode(5);
        list.next.next.next.next.next = new ListNode(6);
    }

    public static int middleElement(ListNode node) {
        if (node == null)
            return -1;

        ListNode i = node;

        while (!(i.next == null || i.next.next == null)) {
            node = node.next;
            i = i.next.next;
        }
        return node.data;
    }

}

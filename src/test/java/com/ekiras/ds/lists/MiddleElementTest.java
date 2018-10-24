package com.ekiras.ds.lists;

import com.ekiras.ds.base.ListNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MiddleElementTest {

    @Test
    public void middleElement_whenNullIsPassed() {
        Assert.assertEquals(-1,MiddleElement.middleElement(null));

    }

    @Test
    public void middleElement_whenListWithOneNodeIsPassed() {
        ListNode list = new ListNode(1);
        Assert.assertEquals(1,MiddleElement.middleElement(list));

    }

    @Test
    public void middleElement_whenOddNumberOfElementsPassed() {
        ListNode list = new ListNode(1);
        list.next = new ListNode(2);
        list.next.next = new ListNode(3);
        list.next.next.next = new ListNode(4);
        list.next.next.next.next = new ListNode(5);
        assertEquals(3, MiddleElement.middleElement(list));
    }

    @Test
    public void middleElement_whenEvenNumberOfElementsPassed() {
        ListNode list = new ListNode(1);
        list.next = new ListNode(2);
        list.next.next = new ListNode(3);
        list.next.next.next = new ListNode(4);
        list.next.next.next.next = new ListNode(5);
        list.next.next.next.next = new ListNode(6);
        assertEquals(3, MiddleElement.middleElement(list));
    }
}
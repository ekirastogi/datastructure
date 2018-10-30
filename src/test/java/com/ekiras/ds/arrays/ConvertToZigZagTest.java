package com.ekiras.ds.arrays;

import org.junit.Assert;
import org.junit.Test;

public class ConvertToZigZagTest {

    @Test
    public void zigzag_arrayIsEmpty() {
        int arr[] = new int[]{};
        ConvertToZigZag.zigzag(arr);
        Assert.assertEquals(0, arr.length);
    }

    @Test
    public void zigzag_test1() {
        int arr[] = new int[]{4, 3, 7, 8, 6, 2, 1};
        ConvertToZigZag.zigzag(arr);
        Assert.assertEquals(7, arr.length);
        Assert.assertEquals(3, arr[0]);
        Assert.assertEquals(7, arr[1]);
        Assert.assertEquals(4, arr[2]);
        Assert.assertEquals(8, arr[3]);
        Assert.assertEquals(2, arr[4]);
        Assert.assertEquals(6, arr[5]);
        Assert.assertEquals(1, arr[6]);
    }

    @Test
    public void zigzag_test2() {
        int arr[] = new int[]{1,2,3,4,5};
        ConvertToZigZag.zigzag(arr);
        Assert.assertEquals(5, arr.length);
        Assert.assertEquals(1, arr[0]);
        Assert.assertEquals(3, arr[1]);
        Assert.assertEquals(2, arr[2]);
        Assert.assertEquals(5, arr[3]);
        Assert.assertEquals(4, arr[4]);
    }
}
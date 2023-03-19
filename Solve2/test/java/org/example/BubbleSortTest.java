package org.example;

import org.junit.Assert;
import org.junit.Test;

public class BubbleSortTest {

    @Test
    public void bubbleSortTestNum1() {
        int[] a = new int[] {8,4,6,2,3,5,7,1};
        int[] res = new int[] {1,2,3,4,5,6,7,8};
        BubbleSort BubblSort = new BubbleSort();
        Assert.assertArrayEquals(res, BubblSort.BubbleSort(a));
    }

    @Test
    public void bubbleSortTestNum2() {
        int[] a = new int[] {8,7,6,5,4,3,2,1};
        int[] res = new int[] {1,2,3,4,5,6,7,8};
        BubbleSort BubblSort = new BubbleSort();
        Assert.assertArrayEquals(res, BubblSort.BubbleSort(a));
    }

    @Test
    public void bubbleSortTestNum3() {
        int[] a = new int[] {1,2,3,4,5,6,7,8};
        int[] res = new int[] {1,2,3,4,5,6,7,8};
        BubbleSort BubblSort = new BubbleSort();
        Assert.assertArrayEquals(res, BubblSort.BubbleSort(a));
    }

    @Test
    public void bubbleSortTestNum4() {
        int[] a = new int[] {0,7,3,4,5,0};
        int[] res = new int[] {0,0,3,4,5,7};
        BubbleSort BubblSort = new BubbleSort();
        Assert.assertArrayEquals(res, BubblSort.BubbleSort(a));
    }
}
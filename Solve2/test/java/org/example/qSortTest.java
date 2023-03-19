package org.example;

import org.junit.Assert;
import org.junit.Test;
public class qSortTest {
    @Test
    public void qSortTestNum1() {
        int[] a = new int[]{7, 5, 6, 3, 4, 2, 1, 8};
        int[] res = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        qSort qSort = new qSort();
        Assert.assertArrayEquals(res, qSort.qSort(a));
    }

    @Test
    public void qSortTestNum2() {
        int[] a = new int[]{8, 7, 6, 5, 4, 3, 2, 1};
        int[] res = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        qSort qSort = new qSort();
        Assert.assertArrayEquals(res, qSort.qSort(a));
    }

    @Test
    public void qSortTestNum3() {
        int[] a = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int[] res = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        qSort qSort = new qSort();
        Assert.assertArrayEquals(res, qSort.qSort(a));
    }

    @Test
    public void qSortTestNum4() {
        int[] a = new int[]{100, 30, 24, 100, 0};
        int[] res = new int[]{0, 24, 30, 100, 100};
        qSort qSort = new qSort();
        Assert.assertArrayEquals(res, qSort.qSort(a));
    }
}


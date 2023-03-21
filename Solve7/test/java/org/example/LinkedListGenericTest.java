package org.example;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListGenericTest {

    @org.junit.Test
    public void add() {
        LinkedListGeneric <Integer> l1 = new LinkedListGeneric();
        l1.add(1);
        int size = l1.size();
        int k = (Integer)l1.get(size-1);
        Assert.assertEquals(1, k);
        l1.add(2);
        size = l1.size();
        k = l1.get(size-1);
        Assert.assertEquals(2, k);
    }

    @org.junit.Test
    public void get() {
        LinkedListGeneric<Integer> l1 = new LinkedListGeneric<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        int k = l1.get(1);
        Assert.assertEquals(2, k);
    }

    @org.junit.Test
    public void size() {
        int n = 3;
        LinkedListGeneric <Integer> ll1 = new LinkedListGeneric<>();
        for(int i = 0; i < n; i++){
            ll1.add(2);
        }
        Assert.assertEquals(n, ll1.size());
    }
}
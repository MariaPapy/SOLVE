package org.example;

import org.junit.Assert;

import java.util.Optional;

import static org.junit.Assert.*;

public class LinkedList1Test {

    @org.junit.Test
    public void add() {
        LinkedList1 lilist = new LinkedList1();
        lilist.add(3);
        int size = lilist.size();
        int k = (Integer)lilist.get(size-1);
        Assert.assertEquals(3, k);
        lilist.add(3);
        size = lilist.size();
        k = (Integer)lilist.get(size-1);
        Assert.assertEquals(3, k);
    }

    @org.junit.Test
    public void get() {
        LinkedList1 lilist = new LinkedList1();
        lilist.add(1);
        lilist.add(2);
        lilist.add(3);
        int k = (Integer)lilist.get(2);
        Assert.assertEquals(3, k);
    }

    @org.junit.Test
    public void size() {
        int n = 3;
        LinkedList1 ll = new LinkedList1();
        for(int i = 0; i < n; i++){
            ll.add(2);
        }
        Assert.assertEquals(n, ll.size());
    }
}
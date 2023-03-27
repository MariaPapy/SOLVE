package org.example;

import org.junit.Assert;

import java.util.HashMap;

public class Exchange1Test {

    @org.junit.Test
    public void exchange() {
        HashMap<Integer, String> map = new HashMap();
        HashMap<String, Integer> swapMap = new HashMap();
        map.put(1, "Cat");
        map.put(2, "Dog");
        swapMap.put("Cat", 1);
        swapMap.put("Dog", 2);
        Exchange1 excahge1 = new Exchange1();
        HashMap newmap = excahge1.exchange(map);
        Assert.assertEquals(swapMap, newmap);
    }
}
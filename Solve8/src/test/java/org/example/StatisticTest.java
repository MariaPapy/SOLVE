package org.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class StatisticTest {

    @Test
    public void countWords() {
        Statistic statistic = new Statistic("Тест.txt");
        HashMap<String, Integer> map = new HashMap();
        map.put("коллекции", 1);
        map.put("солнце", 3);
        map.put("весна", 4);
        map.put("мяу", 1);
        map.put("гав", 1);
        HashMap table = statistic.countWords("Тест.txt");
        Assert.assertEquals(map, table);
    }
}
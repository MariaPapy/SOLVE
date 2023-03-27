package org.example;

import java.util.HashMap;

public class Exchange1 {
    public <V, K> HashMap exchange(HashMap<K, V> map){
        HashMap<V, K> resultMap = new HashMap();
        for (K key: map.keySet()){
            resultMap.put(map.get(key), key);
        }

        return resultMap;
    }
}

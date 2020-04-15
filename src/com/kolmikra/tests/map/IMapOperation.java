package com.kolmikra.tests.map;

import java.util.Map;

public interface IMapOperation<K,V> {
    void run(Map<K,V> map, K key, V value);
}

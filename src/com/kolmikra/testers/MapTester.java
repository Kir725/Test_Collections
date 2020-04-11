package com.kolmikra.testers;

import java.util.*;

public class MapTester {

    public void checkMap() {
        final int smallValue = 50_000;
        final int midValue = 500_000;
        final int largeValue = 1_000_000;
        long hashMapTime;
        long treeMapTime;
        long linkedHashMapTime;
        Map<String, Integer> hashMap = new HashMap<>();
        Map<String, Integer> treeMap = new TreeMap<>();
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        Random generator = new Random();
        long start;
        long stop;

        System.out.println("=========================Map========================");
        System.out.println("==============Put 50_000 elements=================");
        start = System.nanoTime();
        for (int i = 0; i < smallValue; i++) {
            hashMap.put("TestString" + i, i);
        }
        stop = System.nanoTime();
        hashMapTime = (stop - start);
        System.out.println("hashMap: " + hashMapTime + " ns");
        start = System.nanoTime();
        for (int i = 0; i < smallValue; i++) {
            treeMap.put("TestString" + i, i);
        }
        stop = System.nanoTime();
        treeMapTime = (stop - start);
        System.out.println("treeMap: " + treeMapTime + " ns");
        start = System.nanoTime();
        for (int i = 0; i < smallValue; i++) {
            linkedHashMap.put("TestString" + i, i);
        }
        stop = System.nanoTime();
        linkedHashMapTime = (stop - start);
        System.out.println("linkedHashMap: " + linkedHashMapTime + " ns");
        getFasterColl(hashMapTime, treeMapTime, linkedHashMapTime);
        System.out.println("\n==============Put 500_000 elements=================");
        start = System.nanoTime();
        for (int i = 0; i < midValue; i++) {
            hashMap.put("TestString" + i, i);
        }
        stop = System.nanoTime();
        hashMapTime = (stop - start);
        System.out.println("hashMap: " + hashMapTime + " ns");
        start = System.nanoTime();
        for (int i = 0; i < midValue; i++) {
            treeMap.put("TestString" + i, i);
        }
        stop = System.nanoTime();
        treeMapTime = (stop - start);
        System.out.println("treeMap: " + treeMapTime + " ns");
        start = System.nanoTime();
        for (int i = 0; i < midValue; i++) {
            linkedHashMap.put("TestString" + i, i);
        }
        stop = System.nanoTime();
        linkedHashMapTime = (stop - start);
        System.out.println("linkedHashMap: " + linkedHashMapTime + " ns");
        getFasterColl(hashMapTime, treeMapTime, linkedHashMapTime);
        System.out.println("\n==============Put 1_000_000 elements=================");
        start = System.nanoTime();
        for (int i = 0; i < largeValue; i++) {
            hashMap.put("TestString" + i, i);
        }
        stop = System.nanoTime();
        hashMapTime = (stop - start);
        System.out.println("hashMap: " + hashMapTime + " ns");
        start = System.nanoTime();
        for (int i = 0; i < largeValue; i++) {
            treeMap.put("TestString" + i, i);
        }
        stop = System.nanoTime();
        treeMapTime = (stop - start);
        System.out.println("treeMap: " + treeMapTime + " ns");
        start = System.nanoTime();
        for (int i = 0; i < largeValue; i++) {
            linkedHashMap.put("TestString" + i, i);
        }
        stop = System.nanoTime();
        linkedHashMapTime = (stop - start);
        System.out.println("linkedHashMap: " + linkedHashMapTime + " ns");
        getFasterColl(hashMapTime, treeMapTime, linkedHashMapTime);
        System.out.println("\n==============Get 50_000 elements=================");
        start = System.nanoTime();
        for (int i = 0; i < smallValue; i++) {
            hashMap.get("TestString" + generator.nextInt(smallValue - 1));
        }
        stop = System.nanoTime();
        hashMapTime = (stop - start);
        System.out.println("hashMap: " + hashMapTime + " ns");
        start = System.nanoTime();
        for (int i = 0; i < smallValue; i++) {
            treeMap.get("TestString" + generator.nextInt(smallValue - 1));
        }
        stop = System.nanoTime();
        treeMapTime = (stop - start);
        System.out.println("treeMap: " + treeMapTime + " ns");
        start = System.nanoTime();
        for (int i = 0; i < smallValue; i++) {
            linkedHashMap.get("TestString" + generator.nextInt(smallValue - 1));
        }
        stop = System.nanoTime();
        linkedHashMapTime = (stop - start);
        System.out.println("linkedHashMap: " + linkedHashMapTime + " ns");
        getFasterColl(hashMapTime, treeMapTime, linkedHashMapTime);

        System.out.println("\n==============Get 500_000 elements=================");
        start = System.nanoTime();
        for (int i = 0; i < midValue; i++) {
            hashMap.get("TestString" + generator.nextInt(midValue - 1));
        }
        stop = System.nanoTime();
        hashMapTime = (stop - start);
        System.out.println("hashMap: " + hashMapTime + " ns");
        start = System.nanoTime();
        for (int i = 0; i < midValue; i++) {
            treeMap.get("TestString" + generator.nextInt(midValue - 1));
        }
        stop = System.nanoTime();
        treeMapTime = (stop - start);
        System.out.println("treeMap: " + treeMapTime + " ns");
        start = System.nanoTime();
        for (int i = 0; i < midValue; i++) {
            linkedHashMap.get("TestString" + generator.nextInt(midValue - 1));
        }
        stop = System.nanoTime();
        linkedHashMapTime = (stop - start);
        System.out.println("linkedHashMap: " + linkedHashMapTime + " ns");
        getFasterColl(hashMapTime, treeMapTime, linkedHashMapTime);

        System.out.println("\n==============Get 1_000_000 elements=================");
        start = System.nanoTime();
        for (int i = 0; i < largeValue; i++) {
            hashMap.get("TestString" + generator.nextInt(largeValue - 1));
        }
        stop = System.nanoTime();
        hashMapTime = (stop - start);
        System.out.println("hashMap: " + hashMapTime + " ns");
        start = System.nanoTime();
        for (int i = 0; i < largeValue; i++) {
            treeMap.get("TestString" + generator.nextInt(largeValue - 1));
        }
        stop = System.nanoTime();
        treeMapTime = (stop - start);
        System.out.println("treeMap: " + treeMapTime + " ns");
        start = System.nanoTime();
        for (int i = 0; i < largeValue; i++) {
            linkedHashMap.get("TestString" + generator.nextInt(largeValue - 1));
        }
        stop = System.nanoTime();
        linkedHashMapTime = (stop - start);
        System.out.println("linkedHashMap: " + linkedHashMapTime + " ns");
        getFasterColl(hashMapTime, treeMapTime, linkedHashMapTime);
        System.out.println("\n==============Remove 50_000 elements=================");
        start = System.nanoTime();
        for (int i = 0; i < smallValue; i++) {
            hashMap.remove("TestString" + generator.nextInt(smallValue - 1));
        }
        stop = System.nanoTime();
        hashMapTime = stop - start;
        System.out.println("hashMap: " + hashMapTime + " ns");
        start = System.nanoTime();
        for (int i = 0; i < smallValue; i++) {
            treeMap.remove("TestString" + generator.nextInt(smallValue - 1));
        }
        stop = System.nanoTime();
        treeMapTime = stop - start;
        System.out.println("treeMap: " + treeMapTime + " ns");
        start = System.nanoTime();
        for (int i = 0; i < smallValue; i++) {
            linkedHashMap.remove("TestString" + generator.nextInt(smallValue - 1));
        }
        stop = System.nanoTime();
        linkedHashMapTime = stop - start;
        System.out.println("linkedHashMap: " + linkedHashMapTime + " ns");
        getFasterColl(hashMapTime, treeMapTime, linkedHashMapTime);

        System.out.println("\n==============Remove 500_000 elements=================");
        start = System.nanoTime();
        for (int i = 0; i < midValue; i++) {
            hashMap.remove("TestString" + generator.nextInt(midValue - 1));
        }
        stop = System.nanoTime();
        hashMapTime = stop - start;
        System.out.println("hashMap: " + hashMapTime + " ns");
        start = System.nanoTime();
        for (int i = 0; i < midValue; i++) {
            treeMap.remove("TestString" + generator.nextInt(midValue - 1));
        }
        stop = System.nanoTime();
        treeMapTime = stop - start;
        System.out.println("treeMap: " + treeMapTime + " ns");
        start = System.nanoTime();
        for (int i = 0; i < midValue; i++) {
            linkedHashMap.remove("TestString" + generator.nextInt(midValue - 1));
        }
        stop = System.nanoTime();
        linkedHashMapTime = stop - start;
        System.out.println("linkedHashMap: " + linkedHashMapTime + " ns");
        getFasterColl(hashMapTime, treeMapTime, linkedHashMapTime);
    }

    private void getFasterColl(long hashTime, long treeTime, long linkedHashTime) {
        if (hashTime < treeTime) {
            if (hashTime < linkedHashTime) {
                System.out.println("Hash is faster");
            } else {
                System.out.println("LinkedHash is faster");
            }
        } else if (treeTime < linkedHashTime) {
            System.out.println("Tree is faster");
        } else {
            System.out.println("LinkedHash is faster");
        }
    }
}

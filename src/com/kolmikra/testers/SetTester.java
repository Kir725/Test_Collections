package com.kolmikra.testers;

import java.util.*;

public class SetTester {
    private long start;
    private long stop;
    private final int smallValue = 50_000;
    private final int midValue = 500_000;
    private final int largeValue = 1_000_000;
    private Set<Integer> hashSet = new HashSet<>();
    private Set<Integer> treeSet = new TreeSet<>();
    private Set<Integer> linkedHashSet = new LinkedHashSet<>();
    Random generator = new Random();

    public void checkSet() {
        long hashSetTime;
        long treeSetTime;
        long linkedHashSetTime;
        System.out.println("=========================Set=========================");
        System.out.println("==============Add 50_000 elements=================");
        start = System.nanoTime();
        for (int i = 0; i < smallValue; i++) {
            hashSet.add(generator.nextInt());
        }
        stop = System.nanoTime();
        hashSetTime = stop - start;
        System.out.println("hashSet: " + hashSetTime + " ns");

        start = System.nanoTime();
        for (int i = 0; i < smallValue; i++) {
            treeSet.add(generator.nextInt());
        }
        stop = System.nanoTime();
        treeSetTime = stop - start;
        System.out.println("treeSet: " + treeSetTime + " ns");

        start = System.nanoTime();
        for (int i = 0; i < smallValue; i++) {
            linkedHashSet.add(generator.nextInt());
        }
        stop = System.nanoTime();
        linkedHashSetTime = stop - start;
        System.out.println("linkedHashSet: " + linkedHashSetTime + " ns");
        getFasterColl(hashSetTime, treeSetTime, linkedHashSetTime);

        System.out.println("\n==============Add 500_000 elements=================");
        start = System.nanoTime();
        for (int i = 0; i < midValue; i++) {
            hashSet.add(generator.nextInt());
        }
        stop = System.nanoTime();
        hashSetTime = stop - start;
        System.out.println("hashSet: " + hashSetTime + " ns");

        start = System.nanoTime();
        for (int i = 0; i < midValue; i++) {
            treeSet.add(generator.nextInt());
        }
        stop = System.nanoTime();
        treeSetTime = stop - start;
        System.out.println("treeSet: " + treeSetTime + " ns");

        start = System.nanoTime();
        for (int i = 0; i < midValue; i++) {
            linkedHashSet.add(generator.nextInt());
        }
        stop = System.nanoTime();
        linkedHashSetTime = stop - start;
        System.out.println("linkedHashSet: " + linkedHashSetTime + " ns");
        getFasterColl(hashSetTime, treeSetTime, linkedHashSetTime);

        System.out.println("\n==============Add 1_000_000 elements=================");
        start = System.nanoTime();
        for (int i = 0; i < largeValue; i++) {
            hashSet.add(generator.nextInt());
        }
        stop = System.nanoTime();
        hashSetTime = stop - start;
        System.out.println("hashSet: " + hashSetTime + " ns");

        start = System.nanoTime();
        for (int i = 0; i < largeValue; i++) {
            treeSet.add(generator.nextInt());
        }
        stop = System.nanoTime();
        treeSetTime = stop - start;
        System.out.println("treeSet: " + treeSetTime + " ns");

        start = System.nanoTime();
        for (int i = 0; i < largeValue; i++) {
            linkedHashSet.add(generator.nextInt());
        }
        stop = System.nanoTime();
        linkedHashSetTime = stop - start;
        System.out.println("linkedHashSet: " + linkedHashSetTime + " ns");
        getFasterColl(hashSetTime, treeSetTime, linkedHashSetTime);

        System.out.println("\n==============Searching 500_000 times=================");
        start = System.nanoTime();
        for (int i = 0; i < midValue; i++) {
            hashSet.contains(generator.nextInt());
        }
        stop = System.nanoTime();
        hashSetTime = (stop - start);
        System.out.println("hashSet: " + hashSetTime + " ns");

        start = System.nanoTime();
        for (int i = 0; i < midValue; i++) {
            treeSet.contains(generator.nextInt());
        }
        stop = System.nanoTime();
        treeSetTime = (stop - start);
        System.out.println("treeSet: " + treeSetTime + " ns");

        start = System.nanoTime();
        for (int i = 0; i < midValue; i++) {
            linkedHashSet.contains(generator.nextInt());
        }
        stop = System.nanoTime();
        linkedHashSetTime = (stop - start);
        System.out.println("linkedHashSet: " + linkedHashSetTime + " ns");
        getFasterColl(hashSetTime, treeSetTime, linkedHashSetTime);

        System.out.println("\n==============Removing 50_000 elements=================");
        start = System.nanoTime();
        for (int i = 0; i < smallValue; i++) {
            hashSet.remove(generator.nextInt());
        }
        stop = System.nanoTime();
        hashSetTime = stop - start;
        System.out.println("hashSet: " + hashSetTime + " ns");

        start = System.nanoTime();
        for (int i = 0; i < smallValue; i++) {
            treeSet.remove(generator.nextInt());
        }
        stop = System.nanoTime();
        treeSetTime = stop - start;
        System.out.println("treeSet: " + treeSetTime + " ns");

        start = System.nanoTime();
        for (int i = 0; i < smallValue; i++) {
            linkedHashSet.remove(generator.nextInt());
        }
        stop = System.nanoTime();
        linkedHashSetTime = stop - start;
        System.out.println("linkedHashSet: " + linkedHashSetTime + " ns");
        getFasterColl(hashSetTime, treeSetTime, linkedHashSetTime);

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

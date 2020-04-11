package com.kolmikra.testers;

import java.util.*;

public class ListTester {
    private final int smallValue = 50000;
    private final int midValue = 500000;
    private final int largeValue = 5_000_000;
    private ArrayList<Object> arrayList = new ArrayList<>();
    private LinkedList<Object> linkedList = new LinkedList<>();


    private long start;
    private long stop;


    public void checkList() {
        long linkedListTime;
        long arrayListTime;
        System.out.println("=========================List==========================");

        System.out.println("==============Add to end 50_000 elements=================");
        start = System.nanoTime();
        for (int i = 0; i < smallValue; i++) {
            arrayList.add(new Object());
        }
        stop = System.nanoTime();
        arrayListTime = stop - start;
        System.out.println("arrayList: " + arrayListTime + " ns");

        start = System.nanoTime();
        for (int i = 0; i < smallValue; i++) {
            linkedList.add(new Object());
        }
        stop = System.nanoTime();
        linkedListTime = stop - start;
        System.out.println("linkedList: " + linkedListTime + " ns");
        System.out.println(arrayListTime < linkedListTime ? "ArrayList is faster" : "LinkedList is faster");

        System.out.println("==============Add to end 500_000 elements=================");
        start = System.nanoTime();
        for (int i = 0; i < midValue; i++) {
            arrayList.add(new Object());
        }
        stop = System.nanoTime();
        arrayListTime = stop - start;
        System.out.println("arrayList: " + arrayListTime + " ns");

        start = System.nanoTime();
        for (int i = 0; i < midValue; i++) {
            linkedList.add(new Object());
        }
        stop = System.nanoTime();
        linkedListTime = stop - start;
        System.out.println("linkedList: " + linkedListTime + " ns");
        System.out.println(arrayListTime < linkedListTime ? "ArrayList is faster" : "LinkedList is faster");

        System.out.println("==============Add to end 5_000_000 elements=================");
        start = System.nanoTime();
        for (int i = 0; i < largeValue; i++) {
            arrayList.add(new Object());
        }
        stop = System.nanoTime();
        arrayListTime = stop - start;
        System.out.println("arrayList: " + arrayListTime + " ns");

        start = System.nanoTime();
        for (int i = 0; i < largeValue; i++) {
            linkedList.add(new Object());
        }
        stop = System.nanoTime();
        linkedListTime = stop - start;
        System.out.println("linkedList: " + linkedListTime + " ns");
        System.out.println(arrayListTime < linkedListTime ? "ArrayList is faster" : "LinkedList is faster");

        System.out.println("==============Insert=================");
        System.out.println("---Insert 5_000 elements to begin");
        start = System.nanoTime();
        for (int i = 0; i < smallValue; i++) {
            arrayList.add(0, new Object());
        }
        stop = System.nanoTime();
        arrayListTime = stop - start;
        System.out.println("arrayList: " + arrayListTime + " ns");

        start = System.nanoTime();
        for (int i = 0; i < smallValue; i++) {
            linkedList.add(0, new Object());
        }
        stop = System.nanoTime();
        linkedListTime = stop - start;
        System.out.println("linkedList: " + linkedListTime + " ns");
        System.out.println(arrayListTime < linkedListTime ? "ArrayList is faster" : "LinkedList is faster");

        System.out.println("\n---Insert 500_000 elements to begin");
        start = System.nanoTime();
        for (int i = 0; i < midValue; i++) {
            arrayList.add(0, new Object());
        }
        stop = System.nanoTime();
        arrayListTime = stop - start;
        System.out.println("arrayList: " + arrayListTime + " ns");

        start = System.nanoTime();
        for (int i = 0; i < midValue; i++) {
            linkedList.add(0, new Object());
        }
        stop = System.nanoTime();
        linkedListTime = stop - start;
        System.out.println("linkedList: " + linkedListTime + " ns");
        System.out.println(arrayListTime < linkedListTime ? "ArrayList is faster" : "LinkedList is faster");

        System.out.println("\n---Insert 50_000 elements to middle");
        start = System.nanoTime();
        for (int i = 0; i < smallValue; i++) {
            arrayList.add(arrayList.size() / 2, new Object());
        }
        stop = System.nanoTime();
        arrayListTime = stop - start;
        System.out.println("arrayList: " + arrayListTime + " ns");

        start = System.nanoTime();
        for (int i = 0; i < smallValue; i++) {
            linkedList.add(linkedList.size() / 2, new Object());
        }
        stop = System.nanoTime();
        linkedListTime = stop - start;
        System.out.println("linkedList: " + linkedListTime + " ns");
        System.out.println(arrayListTime < linkedListTime ? "ArrayList is faster" : "LinkedList is faster");

        System.out.println("\n---Insert 100_000 elements to middle");
        start = System.nanoTime();
        for (int i = 0; i < midValue/5; i++) {
            arrayList.add(arrayList.size() / 2, new Object());
        }
        stop = System.nanoTime();
        arrayListTime = stop - start;
        System.out.println("arrayList: " + arrayListTime + " ns");

        start = System.nanoTime();
        for (int i = 0; i < midValue/5; i++) {
            linkedList.add(linkedList.size() / 2, new Object());
        }
        stop = System.nanoTime();
        linkedListTime = stop - start;
        System.out.println("linkedList: " + linkedListTime + " ns");
        System.out.println(arrayListTime < linkedListTime ? "ArrayList is faster" : "LinkedList is faster");
        System.out.println("==============Remove=================");
        System.out.println("---Remove 500 elements from begin");
        start = System.nanoTime();
        for (int i = 0; i < 500; i++) {
            arrayList.remove(0);
        }
        stop = System.nanoTime();
        arrayListTime = stop - start;
        System.out.println("arrayList: " + arrayListTime + " ns");

        start = System.nanoTime();
        for (int i = 0; i < 500; i++) {
            linkedList.removeFirst();
        }
        stop = System.nanoTime();
        linkedListTime = stop - start;
        System.out.println("linkedList: " + linkedListTime + " ns");
        System.out.println(arrayListTime < linkedListTime ? "ArrayList is faster" : "LinkedList is faster");
        System.out.println("---Remove 1000 elements from begin");
        start = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            arrayList.remove(0);
        }
        stop = System.nanoTime();
        arrayListTime = stop - start;
        System.out.println("arrayList: " + arrayListTime + " ns");

        start = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            linkedList.removeFirst();
        }
        stop = System.nanoTime();
        linkedListTime = stop - start;
        System.out.println("linkedList: " + linkedListTime + " ns");
        System.out.println(arrayListTime < linkedListTime ? "ArrayList is faster" : "LinkedList is faster");
        System.out.println("\n---Remove 500 elements from middle");
        start = System.nanoTime();
        for (int i = 0; i < 500; i++) {
            arrayList.remove(arrayList.size() / 2);
        }
        stop = System.nanoTime();
        arrayListTime = stop - start;
        System.out.println("arrayList: " + arrayListTime + " ns");

        start = System.nanoTime();
        for (int i = 0; i < 500; i++) {
            linkedList.remove(linkedList.size() / 2);
        }
        stop = System.nanoTime();
        linkedListTime = stop - start;
        System.out.println("linkedList: " + linkedListTime + " ns");
        System.out.println(arrayListTime < linkedListTime ? "ArrayList is faster" : "LinkedList is faster");
        System.out.println("\n---Remove 1000 elements from middle");
        start = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            arrayList.remove(arrayList.size() / 2);
        }
        stop = System.nanoTime();
        arrayListTime = stop - start;
        System.out.println("arrayList: " + arrayListTime + " ns");

        start = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            linkedList.remove(linkedList.size() / 2);
        }
        stop = System.nanoTime();
        linkedListTime = stop - start;
        System.out.println("linkedList: " + linkedListTime + " ns");
        System.out.println(arrayListTime < linkedListTime ? "ArrayList is faster" : "LinkedList is faster");
        System.out.println("\n---Remove 50_000 elements from end ");
        start = System.nanoTime();
        for (int i = 0; i < smallValue; i++) {
            arrayList.remove(arrayList.size() - 1);
        }
        stop = System.nanoTime();
        arrayListTime = stop - start;
        System.out.println("arrayList: " + arrayListTime + " ns");

        start = System.nanoTime();
        for (int i = 0; i < smallValue; i++) {
            linkedList.removeLast();
        }
        stop = System.nanoTime();
        linkedListTime = stop - start;
        System.out.println("linkedList: " + linkedListTime + " ns");
        System.out.println(arrayListTime < linkedListTime ? "ArrayList is faster" : "LinkedList is faster");
        System.out.println("\n---Remove 500_000 elements from end ");
        start = System.nanoTime();
        for (int i = 0; i < midValue; i++) {
            arrayList.remove(arrayList.size() - 1);
        }
        stop = System.nanoTime();
        arrayListTime = stop - start;
        System.out.println("arrayList: " + arrayListTime + " ns");

        start = System.nanoTime();
        for (int i = 0; i < midValue; i++) {
            linkedList.removeLast();
        }
        stop = System.nanoTime();
        linkedListTime = stop - start;
        System.out.println("linkedList: " + linkedListTime + " ns");
        System.out.println(arrayListTime < linkedListTime ? "ArrayList is faster" : "LinkedList is faster");
        System.out.println("\n---Remove 1_000_000 elements from end ");
        start = System.nanoTime();
        for (int i = 0; i < largeValue/5; i++) {
            arrayList.remove(arrayList.size() - 1);
        }
        stop = System.nanoTime();
        arrayListTime = stop - start;
        System.out.println("arrayList: " + arrayListTime + " ns");

        start = System.nanoTime();
        for (int i = 0; i < largeValue/5; i++) {
            linkedList.removeLast();
        }
        stop = System.nanoTime();
        linkedListTime = stop - start;
        System.out.println("linkedList: " + linkedListTime + " ns");
        System.out.println(arrayListTime < linkedListTime ? "ArrayList is faster" : "LinkedList is faster");
        System.out.println("================Get====================");
        System.out.println("---Get 5_000 elements from begin");
        start = System.nanoTime();
        for (int i = 0; i < 5000; i++) {
            arrayList.get(i);
        }
        stop = System.nanoTime();
        arrayListTime = stop - start;
        System.out.println("arrayList: " + arrayListTime + " ns");

        start = System.nanoTime();
        for (int i = 0; i < 5000; i++) {
            linkedList.get(i);
        }
        stop = System.nanoTime();
        linkedListTime = stop - start;
        System.out.println("linkedList: " + linkedListTime + " ns");
        System.out.println(arrayListTime < linkedListTime ? "ArrayList is faster" : "LinkedList is faster");
        System.out.println("---Get 50_000 elements from begin");
        start = System.nanoTime();
        for (int i = 0; i < smallValue; i++) {
            arrayList.get(i);
        }
        stop = System.nanoTime();
        arrayListTime = stop - start;
        System.out.println("arrayList: " + arrayListTime + " ns");

        start = System.nanoTime();
        for (int i = 0; i < smallValue; i++) {
            linkedList.get(i);
        }
        stop = System.nanoTime();
        linkedListTime = stop - start;
        System.out.println("linkedList: " + linkedListTime + " ns");
        System.out.println(arrayListTime < linkedListTime ? "ArrayList is faster" : "LinkedList is faster");
        System.out.println("---Get 5_000 elements from middle");
        start = System.nanoTime();
        for (int i = arrayList.size() / 2; i < linkedList.size() / 2 + smallValue / 10; i++) {
            arrayList.get(i);
        }
        stop = System.nanoTime();
        arrayListTime = stop - start;
        System.out.println("arrayList: " + arrayListTime + " ns");

        start = System.nanoTime();
        for (int i = linkedList.size() / 2; i < linkedList.size() / 2 + smallValue / 10; i++) {
            linkedList.get(i);
        }
        stop = System.nanoTime();
        linkedListTime = stop - start;
        System.out.println("linkedList: " + linkedListTime + " ns");
        System.out.println(arrayListTime < linkedListTime ? "ArrayList is faster" : "LinkedList is faster");
        System.out.println("---Get 5_000 elements from end");
        start = System.nanoTime();
        for (int i = arrayList.size() - 1; i > arrayList.size() - 5000; i--) {
            arrayList.get(i);
        }
        stop = System.nanoTime();
        arrayListTime = stop - start;
        System.out.println("arrayList: " + arrayListTime + " ns");

        start = System.nanoTime();
        for (int i = 0; i < 5000; i++) {
            linkedList.getLast();
        }
        stop = System.nanoTime();
        linkedListTime = stop - start;
        System.out.println("linkedList: " + linkedListTime + " ns");
        System.out.println(arrayListTime < linkedListTime ? "ArrayList is faster" : "LinkedList is faster");
    }
}



package com.kolmikra.tests.util;

import java.util.*;

public class FasterCollection {
    private static Map<String , Long> container = new HashMap<>();

    public static void addOperationTime(String className, long operationTime){
        container.put(className,operationTime);
    }
    public static void getFasterColl(){
        String fasterCollection = Collections.min(container.entrySet(), Map.Entry.comparingByValue()).getKey();
        container.clear();
        System.out.println(fasterCollection + " is faster");

    }

}

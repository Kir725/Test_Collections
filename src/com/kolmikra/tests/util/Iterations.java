package com.kolmikra.tests.util;

public enum Iterations {
    TO_ADD (new int[]{50_000, 500_000, 5_000_000}),
    TO_SEARCH (new int[]{50_000, 500_000, 5_000_000}),
    TO_INSERT_TO_BEGIN (new int[]{5_000, 10_000, 50_000}),
    TO_INSERT_TO_MIDDLE (new int[]{5_000, 50_000, 100_000}),
    TO_GET_RANDOM (new int[]{1000, 5000, 10_000}),
    TO_REMOVE (new int[]{10_000, 50_000, 100_000});

    int[] itValue;
    Iterations(int[] itValue){
        this.itValue = itValue;
    }

    public int[] getIterValue(){
        return itValue;
    }


}

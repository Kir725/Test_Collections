package com.kolmikra.tests;

import java.util.Random;

public abstract class Tester {
    protected long operationTime;
    protected long start;
    protected long stop;
    protected Random gen;

    public Tester() {
        this.operationTime = 0;
        this.start = 0;
        this.stop = 0;
        this.gen = new Random();
    }
}

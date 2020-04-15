package com.kolmikra.tests.set;

import com.kolmikra.tests.Tester;
import com.kolmikra.tests.util.FasterCollection;
import static com.kolmikra.tests.util.Iterations.*;

import java.util.*;

public class SetTester extends Tester {
    private List<Set<Integer>> sets= new ArrayList<>();
    private Set<Integer> minData;

    public SetTester() {
        super();
        sets.add(new HashSet<>());
        sets.add(new LinkedHashSet<>());
        sets.add(new TreeSet<>());
        minData = new HashSet<>();
        for (int i = 0; i < 200_000; i++) {
            minData.add(gen.nextInt());
        }
    }

    public void setCheck(){
        iterCheck(Set::add,"Add", TO_ADD.getIterValue());
        iterCheck(Set::contains,"Search Random", TO_SEARCH.getIterValue());
        iterCheck(Set::remove,"Remove Random", TO_REMOVE.getIterValue());
    }

    private void iterCheck(SetOperation<Integer> action, String actionName, int[] iterations){
        for (int iterValue : iterations) {
            System.out.println("============== "+ actionName + " for " + iterValue + " iterations=================");
            for (Set<Integer> curSet : sets) {
                check(curSet, action, actionName, iterValue);
            }
            FasterCollection.getFasterColl();
            System.out.println();
        }
    }

    private void check(Set<Integer> set, SetOperation<Integer> action, String actionName, int iterValue) {
        set.clear();
        set.addAll(minData);
        start = System.nanoTime();
        for (int i = 0; i < iterValue; i++) {
            action.run(set, gen.nextInt());
        }
        stop = System.nanoTime();
        operationTime = stop - start;
        System.out.println(set.getClass().getSimpleName()+ " "+ actionName + ": " + operationTime + " ns");
        FasterCollection.addOperationTime(set.getClass().getSimpleName(), operationTime);
    }
}

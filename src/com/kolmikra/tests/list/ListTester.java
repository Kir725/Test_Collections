package com.kolmikra.tests.list;

import com.kolmikra.tests.Tester;
import com.kolmikra.tests.util.FasterCollection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import static com.kolmikra.tests.util.Iterations.*;

public class ListTester extends Tester {
    private List<List<Object>> lists = new ArrayList<>();
    private List<Object> minData;

    public ListTester() {
        super();
        minData = new ArrayList<>();
        for (int i = 0; i < 200_000; i++) {
            minData.add(new Object());
        }
        this.lists.add(new ArrayList<>());
        this.lists.add(new LinkedList<>());
    }

    public void listCheck() {
        System.out.println("=========================List==========================");
        iterCheck(List::add, "Add to end", TO_ADD.getIterValue());
        iterCheck((List, x) -> List.add(0, x), "Insert to begin", TO_INSERT_TO_BEGIN.getIterValue());
        iterCheck((List, x) -> List.add(List.size()/2, x), "Insert to middle", TO_INSERT_TO_MIDDLE.getIterValue());
        iterCheck((List, x) -> List.get(gen.nextInt(List.size()-1)), "Get Random", TO_GET_RANDOM.getIterValue());
        iterCheck((List, x) -> List.remove(0), "Remove from begin", TO_REMOVE.getIterValue());
        iterCheck((List, x) -> List.remove(List.size()/2), "Remove from middle", TO_REMOVE.getIterValue());
        iterCheck((List, x) -> List.remove(gen.nextInt(List.size()-1)), "Remove from random", TO_REMOVE.getIterValue());
        iterCheck((List, x) -> List.remove(List.size()-1), "Remove from end", TO_REMOVE.getIterValue());
    }
    private void iterCheck(ListOperation<Object> action, String actionName, int[] iterations){
        for (int iterValue : iterations) {
            System.out.println("============== "+ actionName + " for " + iterValue + " iterations=================");
            for (List<Object> curList : lists) {
                check(curList, action, actionName, iterValue);
            }
            FasterCollection.getFasterColl();
            System.out.println();
        }
    }

    private void check(List<Object> list, ListOperation<Object> action, String actionName, int iterValue) {
        list.clear();
        list.addAll(minData);
        start = System.nanoTime();
        for (int i = 0; i < iterValue; i++) {
            action.run(list, new Object());
        }
        stop = System.nanoTime();
        operationTime = stop - start;
        System.out.println(list.getClass().getSimpleName()+ " "+ actionName + ": " + operationTime + " ns");
        FasterCollection.addOperationTime(list.getClass().getSimpleName(), operationTime);
    }
}




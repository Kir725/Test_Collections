package com.kolmikra.tests.map;

import com.kolmikra.tests.Tester;
import com.kolmikra.tests.util.FasterCollection;
import static com.kolmikra.tests.util.Iterations.*;

import java.util.*;

public class MapTester extends Tester {
    private List<Map<String, Integer>> maps= new ArrayList<>();
    private Map<String, Integer> minData;

    public MapTester() {
        super();
        maps.add(new HashMap<>());
        maps.add(new LinkedHashMap<>());
        maps.add(new TreeMap<>());
        minData = new HashMap<>();
        for (int i = 0; i < 200_000; i++) {
            minData.put("TestString"+i,i);
        }
    }

    public void mapCheck(){
        iterCheck(Map::put,"Put", TO_ADD.getIterValue());
        iterCheck((Map,key,value)-> Map.get(key),"Get Random", TO_GET_RANDOM.getIterValue());
        iterCheck((Map,key,value)-> Map.remove(key),"Remove Random", TO_REMOVE.getIterValue());
    }

    private void iterCheck(MapOperation<String, Integer> action, String actionName, int[] iterations){
        for (int iterValue : iterations) {
            System.out.println("============== "+ actionName + " for " + iterValue + " iterations=================");
            for (Map<String, Integer> curMap : maps) {
                check(curMap, action, actionName, iterValue);
            }
            FasterCollection.getFasterColl();
            System.out.println();
        }
    }

    private void check(Map<String, Integer> map, MapOperation<String, Integer> action, String actionName, int iterValue) {
        map.clear();
        map.putAll(minData);
        start = System.nanoTime();
        for (int i = 0; i < iterValue; i++) {
            action.run(map, "TestString"+gen.nextInt(map.size()-1), i);
        }
        stop = System.nanoTime();
        operationTime = stop - start;
        System.out.println(map.getClass().getSimpleName()+ " "+ actionName + ": " + operationTime + " ns");
        FasterCollection.addOperationTime(map.getClass().getSimpleName(), operationTime);
    }
}

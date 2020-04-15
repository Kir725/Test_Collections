package com.kolmikra;

import com.kolmikra.tests.list.ListTester;
import com.kolmikra.tests.map.MapTester;
import com.kolmikra.tests.set.SetTester;

public class Main {

    public static void main(String[] args) {

        ListTester listTester = new ListTester();
        listTester.listCheck();
        SetTester setTester = new SetTester();
        setTester.setCheck();
        MapTester mapTester = new MapTester();
        mapTester.mapCheck();

    }
}

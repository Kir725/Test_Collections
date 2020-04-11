package com.kolmikra;

import com.kolmikra.testers.ListTester;
import com.kolmikra.testers.MapTester;
import com.kolmikra.testers.SetTester;

public class Main {

    public static void main(String[] args) {
        ListTester listTester= new ListTester();
        SetTester setTester = new SetTester();
        MapTester mapTester = new MapTester();
        listTester.checkList();
//        setTester.checkSet();
//        mapTester.checkMap();
    }
}

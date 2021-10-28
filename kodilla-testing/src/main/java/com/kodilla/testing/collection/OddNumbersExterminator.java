package com.kodilla.testing.collection;

import com.kodilla.testing.calculator.Calculator;

import java.util.ArrayList;

public class OddNumbersExterminator {

    ArrayList<Integer> thelist = new ArrayList<Integer>();

    public ArrayList<Integer> prepareList() {
        for (Integer n = 1; n < 10; n++) {
            thelist.add(n);
        }
        return thelist;
    }

    public ArrayList exterminate() {
        ArrayList<Integer> oddList = new ArrayList<Integer>();

        for (Integer number : thelist) {
            if (number % 2 == 0) {
                oddList.add(number);
            }
        }
        return oddList;
    }
}

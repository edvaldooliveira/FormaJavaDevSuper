package com.devsuperpoo.generics.service;

import java.util.ArrayList;
import java.util.List;

public class PrintService <T> {

    private List<T> list = new ArrayList<>();

    public void addValue(T value) {
        list.add(value);
    }




}

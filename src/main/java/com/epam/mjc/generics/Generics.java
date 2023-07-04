package com.epam.mjc.generics;

import java.util.ArrayList;
import java.util.List;

public class Generics {

    //TODO: Refactor Method-1
    public <T> List<T> boxingMethod(T name) {
        List<T> firstList = new ArrayList<>();
        firstList.add(name);
        List secondList = new ArrayList<>();
        secondList.add(firstList);
        return secondList;
    }

    //TODO: Refactor Method-2
    public <Object> Object genericMethod(Object data) {
        return data;
    }

    //TODO: Refactor Method-3
    public <T> void cloneMethod(List<T> consumer, List<? extends T> producer) {

        consumer.addAll(producer);
    }

}

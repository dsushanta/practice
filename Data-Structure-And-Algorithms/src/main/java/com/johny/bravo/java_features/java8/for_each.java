package com.johny.bravo.java_features.java8;

import java.util.ArrayList;
import java.util.List;

public class for_each {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Joey");
        list.add("Chandler");

        list.forEach(e -> System.out.println(e));

    }
}

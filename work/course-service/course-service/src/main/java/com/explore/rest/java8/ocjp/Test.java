package com.explore.rest.java8.ocjp;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<String> list=new ArrayList<>();

        char var=10;
//        double var=10;
        list.add("X");
        list.add("Y");
        list.add("X");
        list.add("Y");
        list.add("Z");

        list.remove("Y");
        System.out.println(list);
    }
}

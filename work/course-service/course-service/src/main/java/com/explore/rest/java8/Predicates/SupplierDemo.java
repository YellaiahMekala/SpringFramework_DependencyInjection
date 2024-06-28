package com.explore.rest.java8.Predicates;

import org.w3c.dom.stylesheets.LinkStyle;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo  {

    /*@Override
    public String get() {
        return "Hi Yell! Welcome tio Java Programming.";
    }*/

    public static void main(String[] args) {
        Supplier<String> supplier=()->
              "Hi.. Yellaiah..!";

        System.out.println(supplier.get());

        List<String> list1= Arrays.asList("a","b");
        //if list is empty then gives any o/p from supplier.

        System.out.println( list1.stream().findAny().orElseGet(supplier));

    }
}

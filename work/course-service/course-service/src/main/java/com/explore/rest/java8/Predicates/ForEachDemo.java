package com.explore.rest.java8.Predicates;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class ForEachDemo {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
          list.add("yell");
          list.add("mekala");
          list.add("anitha");
          list.add("sriranga");

        for (String s:list
             ) {
          //  System.out.println("print each item in the list using for each method.:" + s);
            
        }


      //  list.stream().forEach(s -> System.out.println(s));
        Map<Integer,String> map=new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3,"c");
        map.put(4,"d");

        //map.forEach((key,value)-> System.out.println(key+" :"+value));
        //map.entrySet().stream().forEach(obj -> System.out.println(obj));

        Consumer<String> consumer=(t)-> System.out.println(t);
      //  consumer.accept("java explore");

        for (String s1:list
             ) {
            consumer.accept(s1);
            
        }


    }
}

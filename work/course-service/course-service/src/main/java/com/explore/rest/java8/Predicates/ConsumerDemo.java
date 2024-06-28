package com.explore.rest.java8.Predicates;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


/*
public class ConsumerDemo  implements Consumer<Integer> {
    @Override
    public void accept(Integer t) {
        System.out.println("print : "+t);

    }
*/

public class ConsumerDemo {

    public static void main(String[] args) {

        Consumer<Integer> consumer=(t)->{
            System.out.println("printing:"+t);
        };

        consumer.accept(10);

        List<Integer> list= Arrays.asList(1,2,3,4,5);
        list.stream().forEach(consumer);
        list.stream().forEach(t->{
            System.out.println("printing:"+t);
        });

    }



}

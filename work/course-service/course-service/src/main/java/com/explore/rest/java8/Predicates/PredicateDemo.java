package com.explore.rest.java8.Predicates;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo  {
    //used for conditional check

  /*  public static void main(String[] args) {
        Predicate<Integer> predicate=new PredicateDemo();
        System.out.println(predicate.test(4));
    }*/

    public static void main(String[] args) {
        Predicate<Integer> predicate=(t)->{
            if (t%2==0){
                return  true;
            }else {
                return  false;
            }
        };

        System.out.println(predicate.test(8));

        List<Integer> list= Arrays.asList(1,2,3,4,5);
        //list.stream().filter(predicate).forEach(t-> System.out.println("print even:"+t));
        list.stream().filter(t->t%2==0).forEach(t -> System.out.println("print even: "+t));
    }
/*
    @Override
    public boolean test(Integer t) {
        if (t%2==0){
            return  true;
        }else {
            return  false;

                    }
    }*/



    //predicate fn for conditional check


}

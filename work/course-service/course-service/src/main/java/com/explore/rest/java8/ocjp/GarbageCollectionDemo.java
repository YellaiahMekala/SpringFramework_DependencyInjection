package com.explore.rest.java8.ocjp;

public class GarbageCollectionDemo {
    public static void main(String[] args) {
        String one, two;
        one=new String("a");
        two=new String("a");
        one=two;
        String three=one;
        one=null;

    }
}

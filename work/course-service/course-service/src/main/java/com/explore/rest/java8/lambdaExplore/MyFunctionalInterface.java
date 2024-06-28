package com.explore.rest.java8.lambdaExplore;

@FunctionalInterface //optional
public interface MyFunctionalInterface {
    void m1(); // abstract method-which is not implemented.

    //here abstract access modifier specification is optional.


    default  void m2(){
        System.out.println("m2 method");
    }


    default  void m3(){
        System.out.println("m3 method");
    }

    default  void m4(){
        System.out.println("m3 method");
    }

}

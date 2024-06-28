package com.explore.rest.java8.ocjp;

public class Chick {
    private  String name="Fluffy";
    {
        System.out.println("un compiled code");
    }
    public Chick(){
        //constructor- noretutn type
        System.out.println("i am a constructor!");
        name="Duke";
    }
    public void  Chick(){
        //not a constructor - having return type
    }
    public static void main(String[] args) {
        //obj of chick class
        Chick chich=new Chick();
        System.out.println(chich.name);
    }
}

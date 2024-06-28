package com.explore.rest.java8.ocjp;

public class Animal {

    String name;
    String spieces;

    public void sound(){
        System.out.println("this animal is dog and it barks." );
    }

    public  String getName(){
        return  name;
            }
            public  void setName(String newName){
                name=newName;

            }
}

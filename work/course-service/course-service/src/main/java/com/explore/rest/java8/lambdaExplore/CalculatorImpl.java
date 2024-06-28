package com.explore.rest.java8.lambdaExplore;


 interface Calculator {
//     void switchOn();
     //void sum(int input);

     int substract(int i1, int i2);
}

public class CalculatorImpl  {  //implements  Calculator

/*
    @Override
    public void switchOn() {
        System.out.println("switch on ");
    }*/


    // parameter    expression      method body
    // ()              ->           {  body }

    public static void main(String[] args) {
       /*Calculator calculator= ()-> {
            System.out.println("switch on");
        };*/

       //calculator.switchOn();

       /* Calculator calculator=(int input )->{
            System.out.println("sum: "+input);
        };

        calculator.sum(200);*/

        Calculator calculator=(i1, i2)->{
            if(i2<i1){
                throw  new RuntimeException("i2 should be greater than i1");
            }else {

                return i2 - i1;
            }
        };

       int result= calculator.substract(10, 20);
        System.out.println("substraction result is:"+ result);
    }

}

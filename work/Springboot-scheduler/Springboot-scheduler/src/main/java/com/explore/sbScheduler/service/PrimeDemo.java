package com.explore.sbScheduler.service;

public class PrimeDemo {
    public static void main(String[] args) {
        int n=0;
        primeCheck(n);
    }

    static void primeCheck(int n){

        if(n/2==0){
            System.out.println("not a prime");
        }
        else {
            System.out.println("given number is prime");
        }
    }


}

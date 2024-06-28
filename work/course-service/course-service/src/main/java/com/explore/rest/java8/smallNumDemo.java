package com.explore.rest.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class smallNumDemo {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 3, 8, 1};

        findSecondSmallest(numbers);
        System.out.println("**********************");
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};
        fetchCommonElements(arr1, arr2);
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        reverseArray(arr);
        reveresedDemo(arr1);

        String[] arrS={"apple","banana","papaya","pineapple","avocado","Grapes"};
        longestStringDemo(arrS);

    }

    private static void longestStringDemo(String[] arrS) {
        int maxLength=Arrays.stream(arrS).mapToInt(String::length).max().orElse(0);
        System.out.println("********************");
        System.out.println("maxLength: "+maxLength);
    }

    private static void reverseArray(int[] arr) {

        IntStream.rangeClosed(0, arr.length / 2).forEach(i -> {
            int temp = arr[i]; //assign first index element value to temp variable to assign it to the last index element at the end.

            arr[i] = arr[arr.length - i - 1];// assigning element at last index to first element
            arr[arr.length - i - 1] = temp;// swap value -- first element value to to last index element

        });
        System.out.println("*********************");
        System.out.println("reversed array is: " + Arrays.toString(arr));

    }

    private static void fetchCommonElements(int[] arr1, int[] arr2) {
        List<Integer> commonElements = Arrays.stream(arr1).filter(number -> Arrays.stream(arr2).anyMatch(arr2Number -> arr2Number == number)).boxed().toList();
        System.out.println("common elements in the arrays are :" + commonElements);

        List<Integer> common = Arrays.stream(arr1).filter(number -> Arrays.stream(arr2).anyMatch(arr2Number -> arr2Number == number)).boxed().collect(Collectors.toList());
    }

    private static void findSecondSmallest(int[] arr) {
        int secondSmallestElement = Arrays.stream(arr).distinct().sorted().skip(1).findFirst().orElseThrow(() -> new IllegalArgumentException("error"));
        System.out.println("second smallest number in the given arary is " + secondSmallestElement);


        int second = Arrays.stream(arr).sorted().skip(2).findFirst().orElseThrow(() -> new IllegalArgumentException("not found"));
        System.out.println("second smallest number in the given arary is " + second);


    }

    static void reveresedDemo(int[] arr) {
        IntStream.range(0, arr.length / 2).forEach(i -> {
            int temp = arr[i];// assign first element value to temp
            arr[i] = arr[arr.length - i - 1]; // assign last element value to first element
            arr[arr.length-i-1]=temp; // assign first element value to last element using temp variable

        });
        System.out.println("reversed:"+Arrays.toString(arr));
    }

}



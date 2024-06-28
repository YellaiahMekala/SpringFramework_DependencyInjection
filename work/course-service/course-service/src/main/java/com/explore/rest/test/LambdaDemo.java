package com.explore.rest.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaDemo {
    public static void main(String[] args) {
        ArrayList<Employee> employeeList= new ArrayList();
        List<Double> collect = employeeList.stream().map(employee -> employee.getSalary()).sorted().collect(Collectors.toList());
        System.out.println(collect);

    }
}




package com.explore.rest.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreamDemo {
    public static void main(String[] args) {
        List<Employee> empList=new ArrayList<Employee>();
        empList.add(new Employee(1,500));
        empList.add(new Employee(2,600));
        empList.add(new Employee(3,700));
        empList.add(new Employee(4,800));
        empList.add(new Employee(5,900));
        empList.add(new Employee(6,1000));

        List<Employee> employees = empList.stream().sorted((o1, o2) -> (int) (o1.getSalary() - o2.getSalary())).skip(3).toList();
        System.out.println(employees);

    }

}

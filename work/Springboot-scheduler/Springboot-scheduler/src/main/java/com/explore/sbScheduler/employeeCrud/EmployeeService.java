package com.explore.sbScheduler.employeeCrud;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {

    /*Add a new employee to the database.
    Display all employees in the database.
    Update the details of an existing employee.
    Delete an employee from the database.*/

     void   saveEmployee(EmployeeEntity employee);
     List<EmployeeEntity> getAllEmployees();

     int updateEmployee(int employeeId);

     String deleteEmployee(int employeeId);




}

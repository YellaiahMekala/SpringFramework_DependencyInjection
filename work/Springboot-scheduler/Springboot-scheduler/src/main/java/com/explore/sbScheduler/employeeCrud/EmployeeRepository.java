package com.explore.sbScheduler.employeeCrud;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // optional
public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Integer> {

    /*Add a new employee to the database.
    Display all employees in the database.
    Update the details of an existing employee.
    Delete an employee from the database.*/



}

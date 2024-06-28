package com.explore.sbScheduler.employeeCrud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/addEmployee")
    ResponseEntity<String> saveEmployee(@RequestBody EmployeeEntity employee){
        employeeService.saveEmployee(employee);
       return  ResponseEntity.ok("employee saved succesfully");
    }




}

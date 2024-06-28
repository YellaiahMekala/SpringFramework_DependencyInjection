package com.explore.sbEmail.crud;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/add")
    ResponseEntity<?> saveEmployee(@RequestBody EmployeeEntity employee) {
        employeeService.saveEmployee(employee);

        return new ResponseEntity<>("employee added successfully", HttpStatus.CREATED);
    }

    @GetMapping("/{mobile}")
    public ResponseEntity<EmployeeEntity> findEmployeeByMobile(@PathVariable("mobile") String mobile) {
        EmployeeEntity Employee = employeeService.findByEmployeeMobile(mobile);

        return new ResponseEntity<>(Employee, HttpStatus.OK);
    }

    @GetMapping("/department/{departmentName}")
    ResponseEntity<List<EmployeeEntity>> findEmployeeByDepartmentName(@PathVariable("departmentName") String departmentName) {
        List<EmployeeEntity> employees = employeeService.findEmployeesByDepartmentName(departmentName);

        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

}

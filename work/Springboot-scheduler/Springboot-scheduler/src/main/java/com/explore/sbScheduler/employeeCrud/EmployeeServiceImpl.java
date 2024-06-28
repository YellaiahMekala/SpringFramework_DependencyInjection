package com.explore.sbScheduler.employeeCrud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl  implements  EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;


    @Override
    public void  saveEmployee(EmployeeEntity employee) {
        employeeRepository.save(employee);

        //return null;
    }

    @Override
    public List<EmployeeEntity> getAllEmployees() {
        return null;
    }

    @Override
    public int updateEmployee(int employeeId) {
        return 0;
    }

    @Override
    public String deleteEmployee(int employeeId) {
        return null;
    }
}

package com.explore.sbEmail.crud;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
//@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    //Constructor dependency injection
    private final EmployeeRepository employeeRepository;
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    @Override
    public void saveEmployee(EmployeeEntity employee) {
        employeeRepository.save(employee);
    }
    @Override
    public EmployeeEntity findByEmployeeMobile(String mobile) {
        return employeeRepository.findByMobile(mobile);
    }
    @Override
    public List<EmployeeEntity> findEmployeesByDepartmentName(String departmentName) {
        return employeeRepository.findByDepartmentName(departmentName);
    }
}

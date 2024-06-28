package com.explore.sbEmail.crud;

import java.util.List;

public interface EmployeeService {

    public void saveEmployee(EmployeeEntity employee);

    public EmployeeEntity findByEmployeeMobile(String mobile);

    List<EmployeeEntity> findEmployeesByDepartmentName(String departmentName);

}

package com.explore.sbEmail.crud;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository //optional
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer> {

    EmployeeEntity findByMobile(String mobile);

    List<EmployeeEntity> findByDepartmentName(String departmentName);

}

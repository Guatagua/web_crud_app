package com.volk_java.ds_app.repository;

import com.volk_java.ds_app.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

package com.volk_java.ds_app.mapper;

import com.volk_java.ds_app.dto.EmployeeDto;
import com.volk_java.ds_app.entity.Employee;

public class EmployeeMapper {

    public static EmployeeDto mapToEmployeeDto(Employee employee){

        return new EmployeeDto(
                employee.getId_emp(),
                employee.getFirstname(),
                employee.getLastname(),
                employee.getEmail()
        );
    }

    public static Employee mapToEmployee(EmployeeDto employeeDto){

        return new Employee(
                employeeDto.getId_emp(),
                employeeDto.getFirstname(),
                employeeDto.getLastname(),
                employeeDto.getEmail()
        );
    }
}

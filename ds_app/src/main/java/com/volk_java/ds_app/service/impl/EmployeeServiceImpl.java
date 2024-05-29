package com.volk_java.ds_app.service.impl;

import com.volk_java.ds_app.dto.EmployeeDto;
import com.volk_java.ds_app.entity.Employee;
import com.volk_java.ds_app.mapper.EmployeeMapper;
import com.volk_java.ds_app.repository.EmployeeRepository;
import com.volk_java.ds_app.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {

        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }
}

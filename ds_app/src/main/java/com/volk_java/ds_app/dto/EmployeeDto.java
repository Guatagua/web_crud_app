package com.volk_java.ds_app.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {
    private Long id_emp;
    private String firstname;
    private String lastname;
    private String email;
}

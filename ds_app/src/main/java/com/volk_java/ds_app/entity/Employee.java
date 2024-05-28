package com.volk_java.ds_app.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name="employee")

public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_emp")
    private Long id_emp;

    @Column (name = "first_name")
    private String firstname;

    @Column (name = "last_name")
    private String lastname;

    @Column (name = "email", nullable = false, unique = true)
    private String email;
}

package com.example.demo.dto;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Data
public class EmployeesDto {
    private Long id;
    private String firstname;
    private String lastname;
    private LocalDate dateOfBirth;

    public EmployeesDto(String firstname) {
        setFirstname(firstname);
    }

}

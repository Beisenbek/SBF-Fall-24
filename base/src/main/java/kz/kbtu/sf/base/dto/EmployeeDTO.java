package kz.kbtu.sf.base.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class EmployeeDTO {
    private String firstName;

    private String lastName;

    private LocalDate dateOfBirth;

}

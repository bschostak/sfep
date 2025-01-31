package de.bschostak.sfep.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String employeeName;
    private Integer employeeAge;
    private String employeeDepartment;
    private String employeePosition;
    private String employeeEmail;
    private String employeePhoneNumber;
    private String employeeAddress;
    private String employeeCity;
    private String employeeState;
}

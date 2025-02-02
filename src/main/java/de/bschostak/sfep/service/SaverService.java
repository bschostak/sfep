package de.bschostak.sfep.service;

import de.bschostak.sfep.model.Employee;
import de.bschostak.sfep.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaverService {
    private final EmployeeRepository employeeRepository;

    @Autowired
    public SaverService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee getSingleEmployee(int id) {
        return employeeRepository.findById(id).get();
    }

    public Employee createEmployee(Employee employee) {
        return null; // TODO: Implement create
    }
    public Employee updateEmployee(Employee employee) {
        return null; // TODO: Implement update
    }

    public void deleteEmployee(int id) {
        // TODO: Implement delete
    }
}

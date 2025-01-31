package de.bschostak.sfep.controller;

import de.bschostak.sfep.model.Employee;
import de.bschostak.sfep.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
public class UserController {
    public Logger LOG = LoggerFactory.getLogger(UserController.class);

    EmployeeRepository employeeRepository;

    @GetMapping("/")
    public String hello() {
        log.info("Hello World");
        return "Hello World";
    }

    @GetMapping("/employees")
    public List<Employee> employees() {
//        TODO: Implement employees
        return employeeRepository.findAll();
    }

    @GetMapping("/employees/{id}")
    public Employee getSingleEmployee(@PathVariable("id") int id) {
//        TODO: Implement getSingleEmployee
        return employeeRepository.findById(id).get();
    }

    @PostMapping("/employee/{id}")
    public Employee createEmployee(@PathVariable("id") int id) {
//        TODO: Implement create
        return employeeRepository.findById(id).get();
    }

    @PutMapping("/employee/{id}")
    public Employee updateEmployee(@PathVariable("id") int id) {
//        TODO: Implement update
        return employeeRepository.findById(id).get();
    }

    @DeleteMapping("/employee/{id}")
    public Employee deleteEmployee(@PathVariable("id") int id) {
//        TODO: Implement delete
        return employeeRepository.findById(id).get();
    }
}

//TODO: Implement business logic
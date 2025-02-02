package de.bschostak.sfep.controller;

import de.bschostak.sfep.model.Employee;
import de.bschostak.sfep.service.SaverService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
public class UserController {
    private final SaverService saverService;

    @Autowired
    public UserController(SaverService saverService) {
        this.saverService = saverService;
    }

    @GetMapping("/")
    public String hello() {
        log.info("Hello World");
        return "Hello World";
    }
    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return saverService.getAllEmployees();
    }

    @GetMapping("/employees/{id}")
    public Employee getSingleEmployee(@PathVariable("id") int id) {
        return saverService.getSingleEmployee(id);
    }

    @PostMapping("/employees/{id}")
    public Employee createEmployee(@PathVariable("id") int id) {
        return null; // TODO: Implement create
    }

    @PutMapping("/employees/{id}")
    public Employee updateEmployee(@PathVariable("id") int id) {
        return null; // TODO: Implement update
    }

    @DeleteMapping("/employees/{id}")
    public void deleteEmployee(@PathVariable("id") int id) {
//        TODO: Implement delete
    }
}
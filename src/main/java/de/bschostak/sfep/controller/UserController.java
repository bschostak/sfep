package de.bschostak.sfep.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    public Logger LOG = LoggerFactory.getLogger(UserController.class);

    @GetMapping("/users")
    public String getUsers() {
        return "LOVE";
    }
}

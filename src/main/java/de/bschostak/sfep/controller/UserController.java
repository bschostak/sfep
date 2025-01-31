package de.bschostak.sfep.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
public class UserController {
    public Logger LOG = LoggerFactory.getLogger(UserController.class);

    @getMapping("/users")
    public void getUsers() {
        LOG.info("getUsers");
    }
}

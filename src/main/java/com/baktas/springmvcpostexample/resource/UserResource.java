package com.baktas.springmvcpostexample.resource;

import com.baktas.springmvcpostexample.model.User;
import com.baktas.springmvcpostexample.service.UserService;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserResource {

    private UserService userService;

    public UserResource(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE,
                 consumes = MediaType.APPLICATION_JSON_VALUE,
                 path = "/user")
    public List<User> create(@RequestBody final User user) {
        userService.create(user);
        return userService.getAll();
    }

    @GetMapping(path = "/users")
    public List<User> getAll() {
        return userService.getAll();
    }
}
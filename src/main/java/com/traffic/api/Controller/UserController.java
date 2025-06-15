package com.traffic.api.controller;

import com.traffic.api.model.User;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private List<User> users = new ArrayList<>();
    private AtomicLong counter = new AtomicLong();

    @PostMapping("/add")
    public User addUser(@RequestBody User userInput) {
        User user = new User(
            counter.incrementAndGet(),
            userInput.getName(),
            userInput.getEmail(),
            userInput.getPassword()
        );
        users.add(user);
        return user;
    }

    @GetMapping("/all")
    public List<User> getAllUsers() {
        return users;
    }
}

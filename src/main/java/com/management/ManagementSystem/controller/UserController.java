package com.management.ManagementSystem.controller;

import com.management.ManagementSystem.entity.User;
import com.management.ManagementSystem.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users/get-all")
    public List<User> getAll() {
        return userService.getAll();
    }

    @GetMapping("/users/{id}")
    public User getById(@PathVariable Long id){
        return userService.getById(id);
    }

    @DeleteMapping("/users/delete/{id}")
    public void delete(@PathVariable Long id){
        userService.delete(id);
    }

    @PostMapping("/users/save")
    public void save(@RequestBody User user){
       userService.save(user);
    }

    @PutMapping("/users/update/{id}")
    public void update(@PathVariable Long id,@RequestBody User user){
        userService.update(id, user);
    }
}

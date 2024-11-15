package com.management.ManagementSystem.service;

import com.management.ManagementSystem.entity.User;

import java.util.List;

public interface UserService {

    List<User> getAll();

    User getById(Long id);

    void delete(Long id);

    void save(User user);

    void update(Long id, User user);

}

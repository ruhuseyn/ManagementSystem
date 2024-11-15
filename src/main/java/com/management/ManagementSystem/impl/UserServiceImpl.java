package com.management.ManagementSystem.impl;

import com.management.ManagementSystem.entity.User;
import com.management.ManagementSystem.repository.UserRepository;
import com.management.ManagementSystem.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<User> getAll() {
        return repository.findAll();
    }

    @Override
    public User getById(Long id) {
        return repository.findById(id).orElseThrow(null);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public void save(User user) {
        repository.save(user);
    }

    @Override
    public void update(Long id, User user) {
        User foundedUser = repository.findById(id).orElseThrow(null);
        foundedUser.setAddress(user.getAddress());
        foundedUser.setFullName(user.getFullName());

        repository.save(foundedUser);
    }
}

package com.lab.exercise.labexercise909.service;

import com.lab.exercise.labexercise909.Exception.UserException;
import com.lab.exercise.labexercise909.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;
import java.util.List;

public interface UserService{
    List<User> getAllUsers();
    void save(User user);
    User getById(Long id) throws UserException;
    void update(User user);
    void deleteById(Long id);

    Integer getUsersCount();

}

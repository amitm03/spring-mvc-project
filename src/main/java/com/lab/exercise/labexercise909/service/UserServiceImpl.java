package com.lab.exercise.labexercise909.service;

import com.lab.exercise.labexercise909.Exception.UserException;
import com.lab.exercise.labexercise909.entity.User;
import com.lab.exercise.labexercise909.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
@Component
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public User getById(Long id) throws UserException {
        Optional<User> optional=userRepository.findById(Math.toIntExact(id));
        User user=null;

        if(optional.isPresent()){
            user=optional.get();
        }else{
            throw new UserException("User not found for id :"+id);
        }
        return user;
    }

    @Override
    public void update(User user) {
        userRepository.save(user);
    }

    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(Math.toIntExact(id));
    }

    @Override
    public Integer getUsersCount() {
        return userRepository.findAll().size();
    }

    public Collection<User> searchUser(String searchString) {
        System.out.println("SearchUser Method value :"+searchString);
        Collection<User> userData = userRepository.searchUser(searchString);
        System.out.println("userData value :"+userData);
        return userData;
    }


}

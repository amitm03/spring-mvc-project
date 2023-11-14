package com.lab.exercise.labexercise909.repository;

import com.lab.exercise.labexercise909.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

    @Query(value="SELECT u from User u where u.firstName= :searchString or u.lastName= :searchString or u.email= :searchString")
    Collection<User> searchUser(String searchString);

}

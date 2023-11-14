package com.lab.exercise.labexercise909.repository;

import com.lab.exercise.labexercise909.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
}

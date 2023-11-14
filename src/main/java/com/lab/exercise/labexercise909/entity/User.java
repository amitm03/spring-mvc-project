package com.lab.exercise.labexercise909.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@Entity
@Table(name="user",schema = "social-media-database")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="email")
    private String email;

    @Column(name="password")
    private String password;
}

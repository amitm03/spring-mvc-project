package com.lab.exercise.labexercise909.Exception;

public class UserException extends Exception{
    private String message;

    public UserException(){

    }
    public UserException(String message) {
        super(message);
        this.message = message;
    }
}

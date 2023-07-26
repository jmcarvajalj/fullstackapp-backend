package com.jmcarvajalj.fullstackappbackend.exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(Long id){
        super("Could not find an user with the id " + id);
    }
}

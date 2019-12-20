package com.codegym.service;

import com.codegym.exception.ResourceNotFoundException;
import com.codegym.model.User;

import java.util.List;

public interface UserService {
    public List<User> getUser();

    public void saveUser(User theUser);

    public User getUser(int theId) throws ResourceNotFoundException;

    public void deleteUser(int theId) throws ResourceNotFoundException;
}





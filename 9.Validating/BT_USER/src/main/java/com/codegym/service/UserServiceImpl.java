package com.codegym.service;

import com.codegym.exception.ResourceNotFoundException;
import com.codegym.model.User;
import com.codegym.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    @Transactional
    public List <User> getUser() {
        return userRepository.findAll();
    }

    @Override
    @Transactional
    public void saveUser(User theUser) {
        userRepository.save(theUser);
    }

    @Override
    @Transactional
    public User getUser(int id) throws ResourceNotFoundException {
        return userRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException(id));
    }

    @Override
    @Transactional
    public void deleteUser(int theId) {
        userRepository.deleteById(theId);
    }
}

package com.codegym.cms.service;

import com.codegym.cms.entity.Customer;
import com.codegym.cms.exception.ResourceNotFoundException;
import com.codegym.cms.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    @Transactional
    public Iterable<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    @Override
    @Transactional
    public void saveCustomer(Customer theCustomer) {
        customerRepository.save(theCustomer);
    }

    @Override
    @Transactional
    public Customer getCustomer(long id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void deleteCustomer(long id) {
        customerRepository.deleteById(id);
    }
}
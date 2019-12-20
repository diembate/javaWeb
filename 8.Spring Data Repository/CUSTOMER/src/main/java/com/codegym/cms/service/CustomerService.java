package com.codegym.cms.service;

import com.codegym.cms.entity.Customer;
import com.codegym.cms.exception.ResourceNotFoundException;

import java.util.List;



public interface CustomerService {

    public Iterable <Customer> getCustomers();

    public void saveCustomer(Customer theCustomer);

    public Customer getCustomer(long id);

    public void deleteCustomer(long id);

}




package com.codegym.cms.repository;
import com.codegym.cms.entity.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;



public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {
}
package com.test.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.test.customer.entity.Customer;


public interface CustomerRepo extends  JpaRepository<Customer, Integer>   {

}

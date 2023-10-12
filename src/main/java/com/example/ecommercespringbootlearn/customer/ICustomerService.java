package com.example.ecommercespringbootlearn.customer;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ICustomerService {
    List<Customer> getAll();
    Customer createOne(Customer customer);
}

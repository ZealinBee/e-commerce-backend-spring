package com.example.ecommercespringbootlearn.customer;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ICustomerService {
    List<GetCustomerDTO> getAll();
    GetCustomerDTO createOne(CreateCustomerDTO customer);
    GetCustomerDTO updateOne(int id, UpdateCustomerDTO customer);
    void deleteOne(int id);
}

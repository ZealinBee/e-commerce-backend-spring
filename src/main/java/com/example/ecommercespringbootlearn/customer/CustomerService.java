package com.example.ecommercespringbootlearn.customer;

import jakarta.persistence.EntityNotFoundException;
import org.hibernate.sql.Update;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerService implements ICustomerService{
    private final ICustomerRepository customerRepository;
    private final CustomerMapper mapper;


    public CustomerService(ICustomerRepository customerRepository, CustomerMapper mapper) {
        this.customerRepository = customerRepository;
        this.mapper = mapper;
    }

    public List<GetCustomerDTO> getAll() {
        List<Customer> customers = customerRepository.findAll();
        List<GetCustomerDTO> dtos = customers.stream()
                .map(customer -> mapper.customerToGetDTO(customer))
                .collect(Collectors.toList());

        return dtos;
    }

    public GetCustomerDTO createOne(CreateCustomerDTO customer) {
        Customer createdCustomer = customerRepository.save(mapper.createDTOtoCustomer(customer));
        return mapper.customerToGetDTO(createdCustomer);
    }

    public GetCustomerDTO updateOne(int id, UpdateCustomerDTO customer) {
        Customer foundCustomer = customerRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Customer not found"));
        foundCustomer.setName(customer.getName());
        foundCustomer.setAvatar(customer.getAvatar());
        foundCustomer.setEmail(customer.getEmail());
        Customer updatedCustomer = customerRepository.save(foundCustomer);
        return mapper.customerToGetDTO(updatedCustomer);
    }

    public void deleteOne(int id) {
        Customer foundCustomer = customerRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Customer not found"));
        customerRepository.delete(foundCustomer);
    }
}

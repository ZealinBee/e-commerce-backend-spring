package com.example.ecommercespringbootlearn.customer;

import org.aspectj.weaver.NewConstructorTypeMunger;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

@Mapper
@Component
public class CustomerMapper {
    GetCustomerDTO customerToGetDTO(Customer customer) {
        return new Customer(
                customer.getCustomerId(),
                customer.getEmail(),
                customer.getName(),
                customer.getRole(),
                customer.getAvatar()
        );
    }

    Customer createDTOtoCustomer(CreateCustomerDTO customer) {
        return new Customer(
                customer.email(),
                customer.password(),
                customer.name(),
                customer.role(),
                customer.avatar()
        );
    }

}

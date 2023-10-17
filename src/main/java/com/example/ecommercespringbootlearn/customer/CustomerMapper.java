package com.example.ecommercespringbootlearn.customer;

import org.aspectj.weaver.NewConstructorTypeMunger;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

@Mapper
@Component
public class CustomerMapper {
    GetCustomerDTO customerToGetDTO(Customer customer) {
        return new GetCustomerDTO(
                customer.getCustomerId(),
                customer.getEmail(),
                customer.getName(),
                customer.getRole(),
                customer.getAvatar()
        );
    }

    Customer createDTOtoCustomer(CreateCustomerDTO dto) {
        return new Customer(
                dto.email(),
                dto.password(),
                dto.name(),
                Role.USER,
                dto.avatar()
        );
    }

}

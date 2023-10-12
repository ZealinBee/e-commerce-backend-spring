package com.example.ecommercespringbootlearn.customer;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/customer")
public class CustomerController {
    private final ICustomerService customerService;

    public CustomerController(ICustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public List<GetCustomerDTO> getAllCustomers() {
        return customerService.getAll();
    }

    @PostMapping
    public GetCustomerDTO createCustomer(@RequestBody CreateCustomerDTO customer) {
        return customerService.createOne(customer);
    }

    @PatchMapping(path = "{customerId}")
    public GetCustomerDTO updateCustomer(@PathVariable("customerId") int customerId, @RequestBody UpdateCustomerDTO customer) {
        return customerService.updateOne(customerId, customer);
    }

    @DeleteMapping(path = "{customerId}")
    public void deleteCustomer(@PathVariable("customerId")int customerId) {
        customerService.deleteOne(customerId);
    }

}

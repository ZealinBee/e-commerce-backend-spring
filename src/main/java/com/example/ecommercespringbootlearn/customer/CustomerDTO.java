package com.example.ecommercespringbootlearn.customer;

public record CustomerDTO() {

}

record GetCustomerDTO(int customerId, String email, String name, Role role, String avatar) {
}

record UpdateCustomerDTO(String email, String name, String avatar){
    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getAvatar() {
        return avatar;
    }


}

record CreateCustomerDTO(String email, String password, String name, Role role, String avatar){
    @Override
    public String email() {
        return email;
    }

    @Override
    public String password() {
        return password;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public Role role() {
        return role;
    }

    @Override
    public String avatar() {
        return avatar;
    }
}
package com.example.ecommercespringbootlearn.customer;

import jakarta.persistence.*;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Customer {
    @Id
    @SequenceGenerator(
            name = "customer_sequence",
            sequenceName = "customer_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "customer_sequence"
    )
    private int customerId;
    private String email;
    private String password;
    private String name;
    @Enumerated(EnumType.STRING)
    private Role role;
    private String avatar;

    public Customer(String email, String password, String name, Role role, String avatar) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.role = role;
        this.avatar = avatar;
    }
}

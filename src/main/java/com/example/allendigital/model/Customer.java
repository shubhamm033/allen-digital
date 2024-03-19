package com.example.allendigital.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Customer {

    int id;

    String name;

    String email;

    String phone;

    public Customer(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}

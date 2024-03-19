package com.example.allendigital.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Seller {

    int sellerId;

    String name;

    String address;

    String organization;

    public Seller(String name, String address, String organization) {
        this.name = name;
        this.address = address;
        this.organization = organization;
    }


    @Override
    public String toString() {
        return "Seller{" +
                "sellerId=" + sellerId +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", organization='" + organization + '\'' +
                '}';
    }
}

package com.example.allendigital.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Order {

    int id;

    Customer customer;

    Deal deal;

    OrderStatus orderStatus;

    Integer quantity;

    public Order(Customer customer , Deal deal, Integer quantity){
        this.customer = customer;
        this.deal = deal;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", customer=" + customer +
                ", deal=" + deal +
                ", orderStatus=" + orderStatus +
                ", quantity=" + quantity +
                '}';
    }

}

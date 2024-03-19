package com.example.allendigital.repo;

import com.example.allendigital.model.Deal;
import com.example.allendigital.model.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderRepo extends BaseRepo {

    private static OrderRepo instance = null;


    List<Order> orderList  = new ArrayList<>();

    private OrderRepo() {

    }


    public void addOrder(Order order) {
        orderList.add(order);
    }


    public static OrderRepo getInstance() {
        if (instance == null) {
            instance = new OrderRepo();
        }

        return instance;
    }


}

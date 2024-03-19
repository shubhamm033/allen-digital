package com.example.allendigital.service;

import com.example.allendigital.model.Order;
import com.example.allendigital.model.OrderStatus;
import com.example.allendigital.repo.DealRepo;
import com.example.allendigital.repo.OrderRepo;

public class OrderService {


    OrderRepo orderRepo = OrderRepo.getInstance();
    DealRepo dealRepo = DealRepo.getInstance();


    public synchronized Order createOrder(Order order) {
        if (!order.getQuantity().equals(1)) {
            System.out.println("Order Quantity not equal than 1");
            return null;
        }

        else if (order.getDeal().getSoldQuantity().equals(order.getDeal().getTotalQuantity())) {
            System.out.println("item  not available");
            return null;
        }

        else {
            int id = orderRepo.getId();
            order.setId(id);
            order.setOrderStatus(OrderStatus.COMPLETED);
            orderRepo.addOrder(order);
            dealRepo.updateInventory(order.getDeal());
            return order;
        }

    }



}

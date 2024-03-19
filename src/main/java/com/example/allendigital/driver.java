package com.example.allendigital;

import com.example.allendigital.model.*;
import com.example.allendigital.service.DataService;
import com.example.allendigital.service.OrderService;

import java.sql.Driver;
import java.util.Date;

public class driver {


    public static void execute() {
        DataService dataService = new DataService();

        OrderService orderService = new OrderService();

        Customer customerOne = new Customer("Shubham", "shubhamm033@gmail.com", "9198013772");
        Customer customerTwo = new Customer("Deepak", "deepka@gmail.com", "987765554555");

        Seller sellerOne = new Seller("Rammohan", "mayur vihar", "rockstate");
        Seller sellerTwo = new Seller("Vivek", "noida", "abc. limited");

        Item itemOne = new Item("Item1", "ayurveda");
        Item itemTwo = new Item("item2", "medicine" );

        Customer customerOneNew = dataService.addCustomer(customerOne);
        Customer customerTwoNew = dataService.addCustomer(customerTwo);

        Item itemOneNew = dataService.addItem(itemOne);
        Item itemTwoNew = dataService.addItem(itemTwo);

        Seller sellerOneNew =  dataService.addSeller(sellerOne);
        Seller sellerTwoNew = dataService.addSeller(sellerTwo);

        Deal dealOne = new Deal(sellerOneNew, itemOneNew, 100);
        Deal dealTwo = new Deal(sellerTwoNew, itemTwoNew, 200);

        Deal dealOneNew = dataService.addDeal(dealOne);
        Deal dealTwoNew = dataService.addDeal(dealTwo);

        Order order = new Order(customerOneNew, dealOneNew, 2);
        Order orderFinal = orderService.createOrder(order);

        System.out.println(orderFinal);

    }


}

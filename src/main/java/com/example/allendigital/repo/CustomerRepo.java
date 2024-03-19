package com.example.allendigital.repo;

import com.example.allendigital.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepo extends BaseRepo {


    private static CustomerRepo instance = null;


    List<Customer> customerList  = new ArrayList<>();

    private CustomerRepo() {

    }


    public void addCustomer(Customer customer) {
        customerList.add(customer);
    }


    public static CustomerRepo getInstance() {
        if (instance == null) {
            instance = new CustomerRepo();
        }

        return instance;
    }


}

package com.example.allendigital.service;

import com.example.allendigital.model.Customer;
import com.example.allendigital.model.Deal;
import com.example.allendigital.model.Item;
import com.example.allendigital.model.Seller;
import com.example.allendigital.repo.CustomerRepo;
import com.example.allendigital.repo.DealRepo;
import com.example.allendigital.repo.ItemRepo;
import com.example.allendigital.repo.SellerRepo;

public class DataService {

    CustomerRepo customerRepo = CustomerRepo.getInstance();
    DealRepo dealRepo = DealRepo.getInstance();

    ItemRepo itemRepo = ItemRepo.getInstance();

    SellerRepo sellerRepo = SellerRepo.getInstance();

    public Customer addCustomer(Customer customer) {
        int id = customerRepo.getId();
        customer.setId(id);
        customerRepo.addCustomer(customer);
        return customer;

    }


    public Seller addSeller(Seller seller) {
        int id = sellerRepo.getId();
        seller.setSellerId(id);
        sellerRepo.addseller(seller);
        return seller;
    }


    public Item addItem(Item item) {
        int id = itemRepo.getId();
        item.setId(id);
        itemRepo.addItem(item);
        return item;
    }


    public Deal addDeal(Deal deal) {
        int id = dealRepo.getId();
        deal.setId(id);
        dealRepo.addDeal(deal);
        return deal;
    }

}

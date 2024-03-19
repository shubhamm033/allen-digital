package com.example.allendigital.repo;

import com.example.allendigital.model.Deal;
import com.example.allendigital.model.Seller;

import java.util.ArrayList;
import java.util.List;

public class SellerRepo extends BaseRepo{

    private static SellerRepo instance = null;


    List<Seller> sellerList  = new ArrayList<>();

    private SellerRepo() {

    }


    public void addseller(Seller seller) {
        sellerList.add(seller);
    }


    public static SellerRepo getInstance() {
        if (instance == null) {
            instance = new SellerRepo();
        }

        return instance;
    }


}

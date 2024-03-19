package com.example.allendigital.repo;

import com.example.allendigital.model.Deal;
import com.example.allendigital.model.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemRepo extends BaseRepo{

    private static ItemRepo instance = null;


    List<Item> itemList  = new ArrayList<>();

    private ItemRepo() {

    }


    public void addItem(Item item) {
        itemList.add(item);
    }


    public static ItemRepo getInstance() {
        if (instance == null) {
            instance = new ItemRepo();
        }

        return instance;
    }


}

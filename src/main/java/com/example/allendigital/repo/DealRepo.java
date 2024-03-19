package com.example.allendigital.repo;

import com.example.allendigital.model.Deal;

import java.util.ArrayList;
import java.util.List;


public class DealRepo extends BaseRepo {
        private static DealRepo instance = null;


        List<Deal> dealList = new ArrayList<>();

        private DealRepo() {

        }

        public void updateInventory(Deal deal) {

            for (Deal newDeal : dealList) {
                if (deal.getId() == newDeal.getId()) {
                    int soldInventory = newDeal.getSoldQuantity();
                    newDeal.setSoldQuantity(soldInventory+1);
                    return;
                }
            }
        }

        public void addDeal(Deal deal) {
            dealList.add(deal);
        }


        public static DealRepo getInstance() {
            if (instance == null) {
                instance = new DealRepo();
            }

            return instance;
        }
    }

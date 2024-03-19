package com.example.allendigital.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
public class Deal {

    int id;

    Seller seller;

    Item item;

    Integer totalQuantity;

    Integer soldQuantity;

    Date validTill;

    DealStatus dealStatus;


    public Deal(Seller seller, Item item, Integer totalQuantity) {
        this.seller = seller;
        this.item = item;
        this.totalQuantity = totalQuantity;
        this.soldQuantity = 0;
//        this.validTill = validTill;
        this.dealStatus = DealStatus.ACTIVE;
    }


    @Override
    public String toString() {
        return "Deal{" +
                "id=" + id +
                ", seller=" + seller +
                ", item=" + item +
                ", totalQuantity=" + totalQuantity +
                ", soldQuantity=" + soldQuantity +
                ", validTill=" + validTill +
                ", dealStatus=" + dealStatus +
                '}';
    }
}

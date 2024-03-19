package com.example.allendigital.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Item {

    int id;

    String name;

    String description;


    public Item(String name, String description) {
        this.name = name;
        this.description = description;
    }


    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

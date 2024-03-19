package com.example.allendigital.repo;

public abstract class BaseRepo {

    int nextId = 1;
    public int getId() {
        int id = nextId;
        nextId++;
        return id;
    }

}

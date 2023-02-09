package com.examples;

public class CocheCRUDImpl implements CocheCRUD{


    @Override
    public void safe() {
        System.out.println("Safe");
    }

    @Override
    public void findAll() {
        System.out.println("FindAll");
    }

    @Override
    public void delete() {
        System.out.println("Delete");
    }
}

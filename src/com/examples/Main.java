package com.examples;

public class Main {

    static CocheCRUD cocheCRUD = new CocheCRUDImpl();
    public static void main(String[] args) {



        cocheCRUD.safe();
        cocheCRUD.delete();
        cocheCRUD.findAll();



    }

}

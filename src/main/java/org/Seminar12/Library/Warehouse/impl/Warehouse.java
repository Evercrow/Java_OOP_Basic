package org.Seminar12.Library.Warehouse.impl;

import org.Seminar12.Library.Warehouse.Product;

import java.util.ArrayList;

import java.util.List;
import java.util.Random;



public class Warehouse implements ChangeWarehouse{

   ArrayList<Product> productList = new ArrayList<>();

    public Warehouse() {
        Random r = new Random();
        for (int i = 0; i <5; i++){
            productList.add(new Product("Товарчик", r.nextInt(10),r.nextInt(10,200 )));
        }
    }

    @Override
    public void addProducts(List<Product> merch) {

    }

    @Override
    public void removeProducts(List<Product> merch) {

    }

    @Override
    public void decreaseProduct(Product product, int amount) {

    }

    @Override
    public void increaseProduct(Product product, int amount) {

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Product p: productList
             ){
            sb.append(String.format("%s \n",p));

        }
        return sb.toString();
    }
}

package org.Seminar12.Library.Warehouse.impl;

import org.Seminar12.Library.Warehouse.Product;

import java.util.List;

public interface ChangeWarehouse {

    public void addProducts(List<Product> merch);
    public void removeProducts(List<Product> merch);
    public void decreaseProduct(Product product,int amount);

    public void increaseProduct(Product product,int amount);


}

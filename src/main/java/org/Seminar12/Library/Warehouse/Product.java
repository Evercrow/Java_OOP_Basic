package org.Seminar12.Library.Warehouse;

import org.Seminar12.Library.Warehouse.impl.ChangeProduct;

public class Product implements ChangeProduct {
    String name;
    int count;
    double price;

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", count=" + count +
                ", price=" + price +
                '}';
    }

    public Product(String name, int count, double price) {
        this.name = name;
        this.count = count;
        this.price = price;
    }

    @Override
    public void decreaseCount(int amount){
        this.count -=amount;
    }

    @Override
    public void increaseCount(int amount){
        this.count +=amount;
    }
}

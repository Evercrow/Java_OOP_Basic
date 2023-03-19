package org.Seminar12.Library.Warehouse;

import org.Seminar12.Library.Warehouse.impl.ChangeProduct;
import org.Seminar12.Library.Warehouse.impl.Warehouse;

import java.util.ArrayList;

public class Order implements ChangeProduct {

    Warehouse warehouse;
    ArrayList<Product> basket;

    public Order( ArrayList<Product> basket) {
        this.warehouse = new Warehouse();
        this.basket = basket;
    }

    @Override
    public void decreaseCount(int amount) {

    }

    @Override
    public void increaseCount(int amount) {

    }
}

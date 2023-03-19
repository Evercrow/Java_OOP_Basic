package org.Seminar12.Library.Warehouse;

import org.Seminar12.Library.Warehouse.impl.Warehouse;

import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        ArrayList<Product> myOrder = new ArrayList<Product>(Arrays.asList(new Product("Товарчик",2,30), new Product("Товарчик",2,20)));

        Order order = new Order(myOrder);
        System.out.println(order.basket);

        System.out.println(order.warehouse);
    }
}

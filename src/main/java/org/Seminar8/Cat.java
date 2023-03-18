package org.Seminar8;

import java.sql.SQLOutput;

public class Cat extends Animal {

    static int catCount;

    public Cat(String name, int maxSwimDistance, String type) {
        super(name, 200, maxSwimDistance, type);
        catCount++;
    }

}

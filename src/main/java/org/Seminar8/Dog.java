package org.Seminar8;

public class Dog extends Animal {

    static int dogCount;

    public Dog(String name) {
        super(name, 500, 10, "Собака");
        dogCount++;
    }
}

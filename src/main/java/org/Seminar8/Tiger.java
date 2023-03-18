package org.Seminar8;

public class Tiger extends Cat{

    static int tigerCount;
    public Tiger(String name, int maxSwimDistance) {
        super(name, maxSwimDistance, "Тигр");
        tigerCount++;
    }
}

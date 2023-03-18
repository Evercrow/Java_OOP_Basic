package org.Seminar8;

public class DomesticCat extends Cat{

    static int domesticCats;
    public DomesticCat(String name) {
        super(name,0, "Домашний кот");
        domesticCats++;
    }
}

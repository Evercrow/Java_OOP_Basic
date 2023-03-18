package org.Seminar8;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {

        Animal[] animals = {new Dog("Бобик"), new Dog("Рекс"), new DomesticCat("Снежок"), new Tiger("Шерхан", 50)};
        for (Animal item: animals) {
            item.run(150);
            item.swim(10);
        }
        //Cat.catCount = 100;
        System.out.println("СatCount = " + Cat.catCount);
        System.out.println("Total count = " + Animal.count);
        System.out.println("Count = " + Cat.count);

    }

}
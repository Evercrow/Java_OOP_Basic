package org.Seminar9;

public class Main {
    public static void main(String[] args) {
        Fruit fruit1 = Fruit.ORANGE;
        switch (fruit1){
            case KIWI -> System.out.println("Киви");
            case APPLE -> System.out.println("яблоко");
            case BANANA -> System.out.println("банан");
            case ORANGE -> System.out.println("апельсин");
        }
    }
}

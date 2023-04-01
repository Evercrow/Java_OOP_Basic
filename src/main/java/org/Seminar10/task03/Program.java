package org.Seminar10.task03;

import java.util.ArrayList;
import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
//        Calc<Integer> calc1 = new Calc<>();
//        System.out.println(calc1.sum(new ArrayList<>(Arrays.asList(1,2,3))));
//        Calc<Double> calc2 = new Calc<>();
//        System.out.println(calc2.sum(new ArrayList<>(Arrays.asList(1.0,2.0,3.5))));

        Calc calc3 = new Calc();
        System.out.println(calc3.sum(new ArrayList<>(Arrays.asList(1.0,2.0,3.5))));
    }
}

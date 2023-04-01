package org.Seminar10.task03;

import java.util.List;

public class Calc {
    public Double sum (List<? extends Number> items){
        double sum = 0;
        for (Number i: items)
            sum += i.doubleValue();
        return sum;
    }
}

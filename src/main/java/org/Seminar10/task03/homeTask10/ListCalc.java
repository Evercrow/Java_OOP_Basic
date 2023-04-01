package org.Seminar10.task03.homeTask10;

import java.util.List;

public class ListCalc{
    public Double sum (List<? extends Number> items){
        double sum = 0;
        for (Number i: items)
            sum += i.doubleValue();
        return sum;
    }

    public Double multiply (List<? extends Number> items){
        double res = 1;
        for (Number i: items)
            res *= i.doubleValue();
        return res;
    }

    public Double divideLists ( List<? extends Number> l1, List<? extends Number> l2){
        return sum(l1)/ sum(l2);
    }

    /**
     * Разделить одно число на несколько
     * @param nominator - первым аргументом числитель
     * @param denominators - вторым аргументом список из чисел, на которые нужно поделить первое число
     * @return веществевенное число
     */
    public Double divide ( Number nominator, List<? extends Number> denominators){
        double res = nominator.doubleValue();
        for (Number i: denominators){
            res /= i.doubleValue();
        }
        return res;
    }

}

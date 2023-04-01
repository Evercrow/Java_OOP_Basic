package org.Seminar10.task03.homeTask10;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 1)расширить класс калькулятор на умножение
 * 2)расширить класс калькулятор на деление
 * 3)расширить класс калькулятор на бинарный перевод(принимаемые значения как стринг, так и инт - тут необходимо подумать как наилучшим образом реализовать,
 * что будет если будут приниматься округляемые Double/Float (округляемые -> с нулем на конце прим. 3.0 , 4.0 и тд т))
 *
 */
public class Program {
    public static void main(String[] args) {

        ListCalc listCalc = new ListCalc();
        System.out.println("basic operations test");
        System.out.println(listCalc.sum(new ArrayList<>(Arrays.asList(1.0,2.0,3.5,2))));
        System.out.println(listCalc.multiply(new ArrayList<>(Arrays.asList(0.5,2,2))));
        System.out.println(listCalc.divideLists(new ArrayList<>(Arrays.asList(1.0,2.0,3.5,2)),
                            new ArrayList<>(Arrays.asList(0.5,5,2.5,2))) );
        System.out.println(listCalc.divide(100,new ArrayList<>(Arrays.asList(5,5,4,2) )));

        BinaryCalc binCalc = new BinaryCalc<>();
        System.out.println("binary conversion test");
        System.out.println(binCalc.anyToBin("8"));
        System.out.println(binCalc.anyToBin(12));
        System.out.println(binCalc.anyToBin(4.6));
    }
}

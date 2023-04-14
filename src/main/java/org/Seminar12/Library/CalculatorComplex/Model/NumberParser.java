package org.Seminar12.Library.CalculatorComplex.Model;

import org.Seminar12.Library.CalculatorComplex.Model.NumberTypes.ComplexNumber;
import org.Seminar12.Library.CalculatorComplex.Model.NumberTypes.NumberClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * В этом методе будут собраны паттерны для распознавания кастомных чисел в строке, например,
 * "i" - это метка мнимой части комплексного числа, "e" - обозначение степенной записи, и т.п.
 */

//в идеале, регулярное выражение, исключающее ошибочный парсинг, будет лежать в отдельном поле класса Pattern в классах кастомных чисел,
// и наш парсер будет "опрашивать" циклом package NumberTypes, проходясь по всем регуляркам для парсинга.
public class NumberParser {

    public NumberClass discernNumber(String input){
        NumberClass result = null;
        if(input.contains("i")){ //метка комплексного
            result =  parseComplexNum(input);
        }else {
            try {
                double d = Double.parseDouble(input);
                result = new ComplexNumber(d, 0);
            } catch(NumberFormatException e) {
                System.out.println("Couldn't parse input to any number type");
                e.printStackTrace();
            }
        }
        return result;
    }


    ComplexNumber parseComplexNum(String snum) {
        String[] parts = snum.split("[+-]");
        double imag = 0;
        double real = 0;
        for (String p : parts){
            if(p.contains("i")){
                imag = Double.parseDouble(p.replace("i", ""));
            } else {
                real = Double.parseDouble(p);
            }
        }
        return new ComplexNumber(real, imag);
    }
}

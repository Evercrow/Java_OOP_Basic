package org.Seminar12.Library.CalculatorComplex.Controller;

import org.Seminar12.Library.CalculatorComplex.Model.NumberParser;
import org.Seminar12.Library.CalculatorComplex.Model.NumberTypes.NumberClass;

import java.util.Scanner;

public class ConsoleInput implements InputHandler {
    NumberParser parser = new NumberParser();
    Scanner in = new Scanner(System.in);
    @Override
    public NumberClass getUserNumber() {

        return parser.discernNumber(in.next());
    }

    @Override
    public String getOperation() {
        return in.next();
    }
}

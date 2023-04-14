package org.Seminar12.Library.CalculatorComplex.Controller;

import org.Seminar12.Library.CalculatorComplex.Model.NumberTypes.NumberClass;


public class CalcControl<N extends NumberClass> {


    public void startConsoleUI(){
        ConsoleInput<N> inp = new ConsoleInput<>();
        inp.mainCycle();

    }
}

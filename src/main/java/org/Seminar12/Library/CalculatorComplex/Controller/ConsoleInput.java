package org.Seminar12.Library.CalculatorComplex.Controller;

import org.Seminar12.Library.CalculatorComplex.Model.Calculation;
import org.Seminar12.Library.CalculatorComplex.Model.Logger;
import org.Seminar12.Library.CalculatorComplex.Model.NumberParser;
import org.Seminar12.Library.CalculatorComplex.Model.NumberTypes.ComplexNumber;
import org.Seminar12.Library.CalculatorComplex.Model.NumberTypes.NumberClass;
import org.Seminar12.Library.CalculatorComplex.View.CalcConsoleView;

import java.util.Scanner;

public class ConsoleInput<N extends NumberClass> extends CalcControl<N> implements InputHandler {


    NumberParser parser = new NumberParser();
    Scanner in = new Scanner(System.in);
    CalcConsoleView view = new CalcConsoleView();

    Calculation<N> calc = new Calculation<>();
    Logger log = new Logger();
    boolean running = true;
    public  NumberClass storedResult;

    void mainCycle(){



        view.showHeader();
        view.showUI();
        storedResult = getUserNumber() ;


         while(running){
            String operand = getOperation();
            storedResult = calc.runOperation(storedResult,getUserNumber(),operand) ;
            view.showResult(storedResult);
        }


    }
    String serviceCheck(String s){
        if(s.contains("CE")){
            reset();
            System.out.println("память сброшена, теперь введите запрошенное выше");
            s = in.next();
        }
        if(s.contains("=")){
            end();
        }
        return s;
    }


    @Override
    public NumberClass getUserNumber() {
        System.out.println("Введите число");
        return parser.discernNumber(serviceCheck(in.next()));
    }

    @Override
    public String getOperation() {
        System.out.println("Введите символ математической операции");
        return serviceCheck(in.next());
    }

    @Override
    public void reset() {
        storedResult = storedResult.multiply(new ComplexNumber());
    }

    @Override
    public boolean end() {
        view.shutdown();
        running = false;
        System.exit(0);
        return false;
    }
}

package org.Seminar12.Library.CalculatorComplex.Model;

import org.Seminar12.Library.CalculatorComplex.Model.NumberTypes.NumberClass;
import org.Seminar12.Library.CalculatorComplex.Model.Operations.Arithmetic.Addition;
import org.Seminar12.Library.CalculatorComplex.Model.Operations.Arithmetic.Division;
import org.Seminar12.Library.CalculatorComplex.Model.Operations.Arithmetic.Multiplication;
import org.Seminar12.Library.CalculatorComplex.Model.Operations.Arithmetic.Subtraction;
import org.Seminar12.Library.CalculatorComplex.Model.Operations.Operation;

public class Calculation<N extends NumberClass> {
    NumberClass result;
    Operation currentOperation;
    public NumberClass runOperation(NumberClass x, NumberClass y, String operator ) {
        try {
            result = identifyOperator(operator).operation(x, y);
        }catch(Exception e){
            e.printStackTrace();
        }

        return result;
    }



    Operation identifyOperator(String operator) throws Exception{
        return switch (operator) {
            case "+" -> currentOperation = new Addition();
            case "-" -> currentOperation = new Subtraction();
            case "*" -> currentOperation = new Multiplication();
            case "/" -> currentOperation = new Division();
            default -> throw new Exception("Unsupported math operation");
        };
    }
}

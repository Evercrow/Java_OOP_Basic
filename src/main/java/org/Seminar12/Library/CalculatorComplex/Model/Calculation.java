package org.Seminar12.Library.CalculatorComplex.Model;

import org.Seminar12.Library.CalculatorComplex.Model.NumberTypes.NumberClass;
import org.Seminar12.Library.CalculatorComplex.Model.Operations.Arithmetic.Addition;
import org.Seminar12.Library.CalculatorComplex.Model.Operations.Arithmetic.Division;
import org.Seminar12.Library.CalculatorComplex.Model.Operations.Arithmetic.Multiplication;
import org.Seminar12.Library.CalculatorComplex.Model.Operations.Arithmetic.Subtraction;
import org.Seminar12.Library.CalculatorComplex.Model.Operations.Operation;

public class Calculation<N extends NumberClass> implements Loggable{
    NumberClass result;
    Operation currentOperation;
    CalcLogger log = new CalcLogger();
    public NumberClass runOperation(NumberClass x, NumberClass y, String operator ) {

        try {
            result = identifyOperator(operator).operation(x, y);
        }catch(Exception e){
            System.out.println("Calculation error");
            e.printStackTrace();
        }

        try {
            storeX(x);
            storeY(y);
            storeResult(result);
            storeOperation(operator);
            log.logOperation();
        }catch(Exception e){
            System.out.println("Couldn't write log");
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


    @Override
    public void storeX(NumberClass x) {
        log.setX(x.toString());

    }

    @Override
    public void storeY(NumberClass y) {
        log.setY(y.toString());

    }

    @Override
    public void storeResult(NumberClass res) {
        log.setRes(res.toString());

    }

    @Override
    public void storeOperation(String operand) {
        log.setOperand(operand);

    }
}

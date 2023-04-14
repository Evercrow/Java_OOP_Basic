package org.Seminar12.Library.CalculatorComplex.Model.Operations.Arithmetic;

import org.Seminar12.Library.CalculatorComplex.Model.NumberTypes.ComplexNumber;
import org.Seminar12.Library.CalculatorComplex.Model.NumberTypes.NumberClass;
import org.Seminar12.Library.CalculatorComplex.Model.Operations.Operation;

public class Division implements Operation{

    @Override
    public NumberClass operation(NumberClass x, NumberClass y) {
        return x.divide((ComplexNumber) y);
    }
}

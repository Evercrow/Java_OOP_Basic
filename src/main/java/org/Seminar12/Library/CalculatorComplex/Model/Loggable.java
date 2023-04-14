package org.Seminar12.Library.CalculatorComplex.Model;

import org.Seminar12.Library.CalculatorComplex.Model.NumberTypes.NumberClass;

public interface Loggable {
    void storeX(NumberClass x);
    void storeY(NumberClass y);
    void storeResult(NumberClass res);
    void storeOperation(String operand);

}

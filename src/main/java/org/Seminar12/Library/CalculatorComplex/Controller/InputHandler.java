package org.Seminar12.Library.CalculatorComplex.Controller;

import org.Seminar12.Library.CalculatorComplex.Model.NumberTypes.NumberClass;

public interface InputHandler {

    NumberClass getUserNumber();
    String getOperation();

    /**
     * Аналог кнопки "C" на обычном калькуляторе, сброс предыдущего результата
     */
    void reset();

    boolean end();
}

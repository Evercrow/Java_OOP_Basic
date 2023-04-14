package org.Seminar12.Library.CalculatorComplex.View;

import org.Seminar12.Library.CalculatorComplex.Model.NumberTypes.NumberClass;

public interface Visualize {
    void showUI();
    void showResult(NumberClass storedResult);
    void showHeader();

    void shutdown();
}

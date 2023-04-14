package org.Seminar12.Library.CalculatorComplex.Model.NumberTypes;

public interface Calculable<N extends NumberClass> {
    N add(N y);
    N multiply(N y);
    N divide(N y);
}

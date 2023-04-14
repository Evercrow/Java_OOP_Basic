package org.Seminar12.Library.CalculatorComplex.Model;

import org.Seminar12.Library.CalculatorComplex.Model.NumberTypes.NumberClass;

public interface Operation<N extends NumberClass>{

    N setValueX(N x);
    N setValueY(N y);
    N operation(N x,N y);
}

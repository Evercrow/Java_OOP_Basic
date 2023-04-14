package org.Seminar12.Library.CalculatorComplex.Model.NumberTypes;

/**
 * абстрактный класс для обобщения всех наших кастомных классов для чисел.
 */
public abstract class NumberClass implements Calculable<ComplexNumber>{
    double realPart;

    double imaginaryPart;

    public NumberClass(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    //ToDo
    // подключение к встроенным числовым типам через "extends Number" , но для этого нужно хорошо изучить внутреннюю имплементацию Java
    // пока просто вынесены поля из комплексного для реализации правила подстановки
}

package org.Seminar12.Library.CalculatorComplex.Model.NumberTypes;

public class ComplexNumber extends NumberClass{
    double realPart;

    double imaginaryPart;
    public ComplexNumber(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    @Override
    public String toString() {
        if(imaginaryPart >=0){
            return String.format("%.2f+%.2fi",realPart,imaginaryPart);
        } else {
            return String.format("%.2f%.2fi",realPart,imaginaryPart);
        }

    }
}

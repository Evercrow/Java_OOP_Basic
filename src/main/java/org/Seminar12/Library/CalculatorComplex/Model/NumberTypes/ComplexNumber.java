package org.Seminar12.Library.CalculatorComplex.Model.NumberTypes;

public class ComplexNumber extends NumberClass{

    public ComplexNumber(double realPart, double imaginaryPart) {
        super(realPart,imaginaryPart);
    }
    public ComplexNumber() {
        super(0,0);
    }

    @Override
    public String toString() {
        if(this.imaginaryPart >=0){
            return String.format("%.2f+%.2fi",this.realPart,this.imaginaryPart);
        } else {
            return String.format("%.2f%.2fi",this.realPart,this.imaginaryPart);
        }

    }


    @Override
    public ComplexNumber add(ComplexNumber y) {
        return new ComplexNumber(this.realPart+y.realPart,this.imaginaryPart+y.imaginaryPart) ;
    }

    @Override
    public ComplexNumber multiply( ComplexNumber y) {
        double real = this.realPart * y.realPart - this.imaginaryPart * y.imaginaryPart;
        double imag = this.realPart * y.imaginaryPart + this.imaginaryPart * y.realPart;
        return new ComplexNumber(real,imag);
    }

    @Override
    public ComplexNumber divide( ComplexNumber y) {
        double real = this.realPart * y.realPart + this.imaginaryPart * y.imaginaryPart;
        double imag = this.realPart * y.imaginaryPart - this.imaginaryPart * y.realPart;
        double divisor = y.realPart* y.realPart + y.imaginaryPart*y.imaginaryPart;
        return  new ComplexNumber(real/divisor,imag/divisor);
    }
}

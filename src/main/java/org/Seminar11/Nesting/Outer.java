package org.Seminar11.Nesting;


public class Outer {

    public Outer(int outerValue) {
        this.outerValue = outerValue;
    }

    /*static // становится обычным публичным классом, написанным внутри одного файлу. Называется "вложенным"*/
     class Inner { //это локальный класс, видит внешнюю область, но его никто не видит самого(private)
        int innerValue;


        public Inner(int innerValue) {
            this.innerValue = innerValue;
        }

        public void innerMethod() {
            System.out.println(innerValue);
            System.out.println(outerValue);
            outerMethod();
        }
    }

    int outerValue;

    public void outerMethod() {
        System.out.println(outerValue);
        //System.out.println(innerValue);
        // innerMethod();
    }

    public static void main(String[] args) {

    }

}


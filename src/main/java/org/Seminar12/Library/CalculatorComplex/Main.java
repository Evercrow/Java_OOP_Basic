package org.Seminar12.Library.CalculatorComplex;

import org.Seminar12.Library.CalculatorComplex.Controller.CalcControl;

/**
 * Создать проект калькулятора комплексных чисел (достаточно сделать сложение, умножение и деление).
 * Применить при создании программы архитектурные паттерны, добавить логирование калькулятора.
 * Соблюдать принципы SOLID, паттерны проектирования. Можно выбрать другой язык программирования, например C# или Python,
 * если выбран язык, отличный от JAVA, то необходимо написать документ, каким образом можно запустить приложение
 * (что необходимо установить, каким образом запускать и т.п.)
 */
public class Main {
    public static void main(String[] args) {
       // "src/main/java/org/Seminar12/Library/Homework/Main.java"
        CalcControl  calc = new CalcControl();
        calc.start();
    }
}

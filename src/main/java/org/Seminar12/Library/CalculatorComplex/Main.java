package org.Seminar12.Library.CalculatorComplex;

import org.Seminar12.Library.CalculatorComplex.Controller.CalcControl;
import org.Seminar12.Library.CalculatorComplex.Model.NumberTypes.ComplexNumber;


/**
 * Создать проект калькулятора комплексных чисел (достаточно сделать сложение, умножение и деление).
 * Применить при создании программы архитектурные паттерны, добавить логирование калькулятора.
 * Соблюдать принципы SOLID, паттерны проектирования. Можно выбрать другой язык программирования, например C# или Python,
 * если выбран язык, отличный от JAVA, то необходимо написать документ, каким образом можно запустить приложение
 * (что необходимо установить, каким образом запускать и т.п.)
 */
public class Main {
    public static void main(String[] args) {

        CalcControl<ComplexNumber>  calc = new CalcControl<>();
        calc.startConsoleUI();


    }
    //ToDo обработка ошибок ввода мягким вариантом, преобразование под капотом мелочей вроде "+-i"
}

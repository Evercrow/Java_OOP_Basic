package org.Seminar12.Library.CalculatorComplex.View;

import org.Seminar12.Library.CalculatorComplex.Controller.CalcControl;
import org.Seminar12.Library.CalculatorComplex.Model.NumberTypes.NumberClass;

public class CalcConsoleView implements Visualize{
    @Override
    public void showUI() {
        System.out.println("-------");
        System.out.println("Стандартный формат комплексного числа 'a+bi'");
        System.out.println("Если в числе простая мнимая единица +-i , то пишите +-1i");
        System.out.println("При последовательных операциях используется накопленный результат");
        System.out.println("Для его сброса, наберите в консоли латинское 'CE' ");
        System.out.println("Поддерживаемые операторы:");
        System.out.println("+, -, *, /");
        System.out.println("Для завершения работы введите '='");
    }

    @Override
    public void showResult(NumberClass storedResult) {
        System.out.println(storedResult);

    }

    @Override
    public void showHeader() {
        System.out.println("-------");
        System.out.println("Вы запустили калькулятор комплексных чисел.");
    }

    @Override
    public void shutdown() {
        System.out.println("программа завершена успешно, спасибо за использование.");
    }
}

package org.Seminar11.Nesting.SchoolMVC;

import org.Seminar11.Nesting.SchoolMVC.Controller.Controller;

/**
 * 1. Создать класс УчебнаяГруппа содержащая в себе поля Преподаватель и список Студентов
 * 2. Создать класс УчебнаяГруппаСервис, в котором реализована функция(входные параметры - (Teacher,
 * List<Strudent>)) формирования из Студентов и Преподавателя УчебнойГруппы и возвращения его
 * 3. Создать метод в Контроллере, в котором агрегируются функции получения списка студентов (их id) и
 * преподавателя (его id) и формирования учебной группы, путем вызова метода из сервиса
 * 4. Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре
 * Формат сдачи: ссылка на гитхаб проект
 */
public class Main {

    public static void main(String[] args) {

        Controller schoolDB = new Controller();
        schoolDB.start();

    }

    //TODO SOLID runover
    // list id shift after deleting

}

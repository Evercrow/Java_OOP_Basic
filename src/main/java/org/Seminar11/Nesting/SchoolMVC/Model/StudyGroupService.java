package org.Seminar11.Nesting.SchoolMVC.Model;

import java.util.List;

// Пока класс слишком простой для SOLID,но при расширении функционала работы с группами:
// S - опасность сделать божественный класс.Нужно будет разделение на классы-наследники.
// O - При добавлении фич лучше будет сделать общий базовый интерфейс из этого класса(с одной функцией operation() , например)
// и подключать в него отдельные функции перегрузкой
// L -  при правильной иерархии как раз засчет подстановки контроллер будет выбирать нужную операцию. Понадобится будет сделать входы-выходы единообразными.
// I - этот принцип будет меньше про разделении интерфейсов(так как Service - классы больше набор служебных функций, чем сущности сами по себе),
// и больше про соблюдение S принципа разбиения классов внутри MVC-паттерна
// D - схоже с тем, что мы сделали в UserService, можно добавить обобщения на учеников и учителей вместо конкретных имен классов.
public class StudyGroupService{


    public StudyGroup formGroup(Teacher t, List<Student> l){
        return new StudyGroup(l,t);
    }



}

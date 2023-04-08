package org.Seminar11.Nesting.SchoolMVC.Controller;

import org.Seminar11.Nesting.SchoolMVC.Model.*;
import org.Seminar11.Nesting.SchoolMVC.View.UserView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// S - контроллер сейчас имеет слишком много разной логики. Нужно оставить только консольный прием, вывод менюшек, и аггрегацию нужных методов из других классов нашей программы
// O - по открытости-закрытости  сделать в выоде меню больше абстракции, чтобы можно было добавлять новые опции в меню и менять сообщения, не залезая в start()
// L  - сам контроллер без иерархии наследников, поэтому данный принцип пока тут не применим.
// I - сегрегация интерфейсав - может понадобится при абстракции взаимодействия с пользователем и хранения БД
// D - Прицип инверсии зависимостей .Здесь принцип уже выполняется, так как единственная  зависимость у нас на User , который явялется для нас достаточно универсальной абстракцией
public class Controller {




    public void start(){


        Scanner input = new Scanner(System.in);
        UserService<User> us = new UserService();
        UserView show = new UserView();
        List<User> users = new ArrayList<>();
        menu: while(true){
            System.out.println("-------");
            System.out.println("Вы просматриваете базу данных школы.");
            System.out.println("Выберите нужное действие:");
            System.out.println("1.Добавить нового пользователя");
            System.out.println("2.Просмотр пользователей");
            System.out.println("3.Удаление пользователя");
            System.out.println("4.Создать учебную группу");

            switch (input.nextInt()){
                case 1:
                    try {
                        users.add(new Student());
                        users.add(new Student());
                        users.add(new Student());
                        users.add(new Student());
                        users.add(new Student());
                        users.add(new Teacher());
                        users.add(new Teacher());
                    } catch(Exception e){
                        System.out.println("Unexpected User Class");
                    }
                    System.out.println("пользователи добавлены");

                    break;
                case 2:
                    System.out.println(show.consoleViewAll(users));
                    break;
                case 3:
                    System.out.println("Введите id удаляемого пользователя");
                    users = removeUser(input.nextInt(),users);
                    break;
                case 4:
                    System.out.println(show.consoleViewSpecific(users,show.getAllTeacherID(users)));
                    System.out.println("Выберите учителя через ID");
                    StudyGroup<Teacher,Student> stGroup = newGroup(input.nextInt(), show.getAllStudentID(users),users);
                    System.out.println("Была создана такая группа:");
                    System.out.println(show.groupView(stGroup));
                    break;
                default:
                    System.out.println("Завершаю работу");
                    break menu;
            }
        }
    }

    /**
     Создать метод в Контроллере, в котором агрегируются функции получения списка студентов (их id) и
     преподавателя (его id) и формирования учебной группы, путем вызова метода из сервиса
     */
    StudyGroup newGroup(int tID, List<Integer> studentsID, List<User> db) {
        StudyGroupService gs = new StudyGroupService();
        Teacher teach = (Teacher) db.get(tID);
        List<Student> students = new ArrayList<>();

        for (int id : studentsID){
            students.add((Student) db.get(id));
        }

        StudyGroup formed = gs.formGroup(teach, students);
        teach.setGroups(List.of(formed.getGroupID()));
        return formed;

    }

    List<User> removeUser(int id, List<User> db){
        System.out.println("Введите id удаляемого пользователя");
        db.remove(id);
        int currId = 0;
        for (int i = id; i < db.size(); i++){
            currId = db.get(i).getID();
            db.get(i).setID(currId-1);
        }
        return db;
    }

}





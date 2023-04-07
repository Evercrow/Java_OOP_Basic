package org.Seminar11.Nesting.SchoolMVC.Controller;

import org.Seminar11.Nesting.SchoolMVC.Model.*;
import org.Seminar11.Nesting.SchoolMVC.View.UserView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

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
                    System.out.println("Not implemented yet"); //out of bounds error for list storage
//                    System.out.println("Введите id удаляемого пользователя");
//                    users.remove(input.nextInt());
                    break;
                case 4:
                    System.out.println(show.consoleViewSpecific(users,show.getAllTeacherID(users)));
                    System.out.println("Выберите учителя через ID");
                    StudyGroup stGroup = newGroup(input.nextInt(), show.getAllStudentID(users),users);
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
    StudyGroup newGroup(int tID,List<Integer>studentsID, List<User> db){
            StudyGroupService gs = new StudyGroupService();
            Teacher teach =(Teacher) db.get(tID);
            List<Student> students = new ArrayList<>();
        for (int id: studentsID){
            students.add((Student) db.get(id));
        }
            StudyGroup formed  = gs.formGroup(teach,students);
            teach.setGroups(List.of(formed.getGroupID()));
            return formed;

    }

}




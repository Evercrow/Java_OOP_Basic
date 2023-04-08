package org.Seminar11.Nesting.SchoolMVC.Controller.Query;

import org.Seminar11.Nesting.SchoolMVC.Controller.ConsoleMenu;
import org.Seminar11.Nesting.SchoolMVC.Model.*;
import org.Seminar11.Nesting.SchoolMVC.View.UserView;

import java.util.ArrayList;
import java.util.List;

public class CreateGroupQuery implements MenuOption {

    static UserView show = new UserView();
    @Override
    public String menuDescription() {
        return "Создать учебную группу";
    }

    @Override
    public List<User> action(List<User> users) {
        System.out.println(show.consoleViewSpecific(users,show.getAllTeacherID(users)));
        System.out.println("Выберите учителя через ID");
        StudyGroup<Teacher, Student> stGroup = newGroup(ConsoleMenu.input.nextInt(), show.getAllStudentID(users),users);
        System.out.println("Была создана такая группа:");
        System.out.println(show.groupView(stGroup));

        return users;
    }

    /**
     Создать метод в Контроллере, в котором агрегируются функции получения списка студентов (их id) и
     преподавателя (его id) и формирования учебной группы, путем вызова метода из сервиса
     */
    StudyGroup<Teacher, Student> newGroup(int tID, List<Integer> studentsID, List<User> db) {
        StudyGroupCreate<Teacher,Student> gs = new StudyGroupCreate<>();
        Teacher teach = (Teacher) db.get(tID);
        List<Student> students = new ArrayList<>();

        for (int id : studentsID){
            students.add((Student) db.get(id));
        }

        StudyGroup<Teacher, Student> formed = gs.formGroup(teach, students);
        teach.setGroups(List.of(formed.getGroupID()));
        return formed;

    }



}

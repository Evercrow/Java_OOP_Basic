package org.Seminar11.Nesting.SchoolMVC.Controller.Query;

import org.Seminar11.Nesting.SchoolMVC.Controller.ConsoleMenu;
import org.Seminar11.Nesting.SchoolMVC.Model.Core.Student;
import org.Seminar11.Nesting.SchoolMVC.Model.Core.StudyGroup;
import org.Seminar11.Nesting.SchoolMVC.Model.Core.Teacher;
import org.Seminar11.Nesting.SchoolMVC.Model.Core.User;
import org.Seminar11.Nesting.SchoolMVC.Model.Service.Groups.StudyGroupCreate;
import org.Seminar11.Nesting.SchoolMVC.Model.Service.Users.UserIdServer;
import org.Seminar11.Nesting.SchoolMVC.View.ConsoleUserView;
import org.Seminar11.Nesting.SchoolMVC.View.GroupView;

import java.util.ArrayList;
import java.util.List;

public class CreateGroupQuery implements MenuOption {

    static ConsoleUserView show = new ConsoleUserView();
    static UserIdServer findId = new UserIdServer();
    static GroupView<Teacher, Student> gShow = new GroupView<>();
    @Override
    public String menuDescription() {
        return "Создать учебную группу";
    }

    @Override
    public List<User> action(List<User> users) {
        System.out.println(show.viewSpecific(users,findId.getAllTeacherID(users)));
        System.out.println("Выберите учителя через ID");
        StudyGroup<Teacher, Student> stGroup = newGroup(ConsoleMenu.input.nextInt(), findId.getAllStudentID(users),users);
        System.out.println("Была создана такая группа:");
        System.out.println(gShow.groupView(stGroup));

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

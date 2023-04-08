package org.Seminar11.Nesting.SchoolMVC.Controller.Query;

import org.Seminar11.Nesting.SchoolMVC.Model.Core.Student;
import org.Seminar11.Nesting.SchoolMVC.Model.Core.Teacher;
import org.Seminar11.Nesting.SchoolMVC.Model.Core.User;

import java.util.List;

public class AddQuery implements MenuOption {

    @Override
    public String menuDescription() {
        return "Добавить нового пользователя";
    }

    @Override
    public List<User> action(List<User> users) {
        return addExampleData(users);
    }

    List<User> addExampleData(List<User> users) {
        users.add(new Student());
        users.add(new Student());
        users.add(new Student());
        users.add(new Student());
        users.add(new Student());
        users.add(new Teacher());
        users.add(new Teacher());
        System.out.println("пользователи добавлены");
        return  users;
    }
}

package org.Seminar11.Nesting.SchoolMVC.Controller.Query;

import org.Seminar11.Nesting.SchoolMVC.Model.Core.User;
import org.Seminar11.Nesting.SchoolMVC.View.ConsoleUserView;

import java.util.List;

public class ViewQuery implements MenuOption {
    static ConsoleUserView show = new ConsoleUserView();
    @Override
    public String menuDescription() {
        return "Просмотр пользователей";
    }

    @Override
    public List<User> action(List<User> users) {
        return showAllConsole(users);
    }

    List<User> showAllConsole(List<User> users) {
        System.out.println(show.viewAll(users));
        return users;
    }
}

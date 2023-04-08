package org.Seminar11.Nesting.SchoolMVC.Controller.Query;

import org.Seminar11.Nesting.SchoolMVC.Model.User;
import org.Seminar11.Nesting.SchoolMVC.View.UserView;

import java.util.List;

public class ViewQuery implements MenuOption {
    static UserView show = new UserView();
    @Override
    public String menuDescription() {
        return "Просмотр пользователей";
    }

    @Override
    public List<User> action(List<User> users) {
        return showAllConsole(users);
    }

    List<User> showAllConsole(List<User> users) {
        System.out.println(show.consoleViewAll(users));
        return users;
    }
}

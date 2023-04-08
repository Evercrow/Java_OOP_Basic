package org.Seminar11.Nesting.SchoolMVC.Controller.Query;

import org.Seminar11.Nesting.SchoolMVC.Model.Core.User;

import java.util.List;

/**
 * универсальный интерфейс всех опций в консольном меню Контроллера(ConsoleMenu)
 */
public interface MenuOption {
    String menuDescription();

    List<User> action(List<User> users);

}

package org.Seminar11.Nesting.SchoolMVC.Controller.Query;

import org.Seminar11.Nesting.SchoolMVC.Controller.ConsoleMenu;
import org.Seminar11.Nesting.SchoolMVC.Model.Core.User;

import java.util.List;

public class DeleteQuery implements MenuOption {
    @Override
    public String menuDescription() {
        return "Удаление пользователя";
    }

    @Override
    public List<User> action(List<User> users) {
        System.out.println("Введите id удаляемого пользователя");
        return removeUser(ConsoleMenu.input.nextInt(),users);
    }

    List<User> removeUser(int id, List<User> db){
        db.remove(id);
        int currId = 0;
        for (int i = id; i < db.size(); i++){
            currId = db.get(i).getID();
            db.get(i).setID(currId-1);
        }
        return db;
    }
}

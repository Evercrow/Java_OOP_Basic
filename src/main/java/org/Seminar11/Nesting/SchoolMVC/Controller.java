package org.Seminar11.Nesting.SchoolMVC;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    public static void main(String[] args) {
        UserService db = new UserService();
        List<User> users = new ArrayList<>();

        users.add(db.create(new Student()));
        users.add(db.create(new Teacher()));

        UserView show = new UserView();
        System.out.println(show.read(users));

    }

    //TODO вынести main отдельно
    // обобщения в списках
    // менюшка во View



}

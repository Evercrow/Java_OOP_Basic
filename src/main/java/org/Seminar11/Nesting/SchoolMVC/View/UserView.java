package org.Seminar11.Nesting.SchoolMVC.View;

import org.Seminar11.Nesting.SchoolMVC.Model.User;

import java.util.List;

public class UserView {

    public String read(List<User> users) {
        StringBuilder sb = new StringBuilder();
        for (User u:users
             ){
            sb.append(String.format("%s %d %s \n",u.getFio(), User.ID,u.getDatebirth()));

        }
        return sb.toString();
    }

}

package org.Seminar11.Nesting.SchoolMVC;

import java.util.List;

public class UserView {

    public String read(List<User> users) {
        StringBuilder sb = new StringBuilder();
        for (User u:users
             ){
            sb.append(String.format("%s %d %s \n",u.fio,u.ID,u.datebirth));

        }
        return sb.toString();
    }

}

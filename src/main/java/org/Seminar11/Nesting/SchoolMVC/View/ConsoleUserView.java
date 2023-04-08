package org.Seminar11.Nesting.SchoolMVC.View;

import org.Seminar11.Nesting.SchoolMVC.Model.Core.User;
import org.Seminar11.Nesting.SchoolMVC.View.Formaters.ConsoleFormat;

import java.util.List;

public class ConsoleUserView extends UserView implements BasicView{
    StringBuilder sb;
    //StringBuilder sb = new StringBuilder(); //sb сохраняется между разными instance ConsoleUserView
    ConsoleFormat cf;
    @Override
    public String viewAll(List<User> users) {
        sb = new StringBuilder(); //remove this for sb repeating bug
        cf = new ConsoleFormat();
        for (User u:users
        ){
            sb.append(cf.buildUserEntry(u));

        }
        return sb.toString();
    }

    @Override
    public  String viewSpecific ( List<User> users, List<Integer> rows){
        sb = new StringBuilder();
        cf = new ConsoleFormat();
        for (int id:rows
        ){
            User u = users.get(id);
            sb.append(cf.buildUserEntry(u));

        }
        return sb.toString();
    }

}

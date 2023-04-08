package org.Seminar11.Nesting.SchoolMVC.View;

import org.Seminar11.Nesting.SchoolMVC.Model.Core.User;

import java.util.List;

public interface BasicView {
    public String viewAll(List<User> users);
    public  String viewSpecific ( List<User> users, List<Integer> rows);

}

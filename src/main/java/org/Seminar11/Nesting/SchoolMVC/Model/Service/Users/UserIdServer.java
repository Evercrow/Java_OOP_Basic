package org.Seminar11.Nesting.SchoolMVC.Model.Service.Users;

import org.Seminar11.Nesting.SchoolMVC.Model.Core.Student;
import org.Seminar11.Nesting.SchoolMVC.Model.Core.Teacher;
import org.Seminar11.Nesting.SchoolMVC.Model.Core.User;

import java.util.ArrayList;
import java.util.List;

public class UserIdServer extends UserService implements IdGetter {
    @Override
    public List<Integer> getAllStudentID( List<? extends User> db){
        List<Integer> idList = new ArrayList<>();
        for (User u:db
        ){
            if (u instanceof Student){
                idList.add(u.getID());
            }
        }
        return idList;
    }

    @Override
    public List<Integer> getAllTeacherID( List<? extends User> db){
        List<Integer> idList = new ArrayList<>();
        for (User u:db
        ){
            if (u instanceof Teacher){
                idList.add(u.getID());
            }
        }
        return idList;
    }
}

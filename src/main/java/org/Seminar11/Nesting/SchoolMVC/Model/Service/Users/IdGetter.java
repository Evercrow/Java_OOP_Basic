package org.Seminar11.Nesting.SchoolMVC.Model.Service.Users;

import org.Seminar11.Nesting.SchoolMVC.Model.Core.User;
import org.Seminar11.Nesting.SchoolMVC.Model.Service.DataService;

import java.util.List;

public interface IdGetter extends DataService {
    public List<Integer> getAllStudentID(List<? extends User> db);
    public List<Integer> getAllTeacherID( List<? extends User> db);

}

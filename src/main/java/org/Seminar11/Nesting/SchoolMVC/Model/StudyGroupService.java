package org.Seminar11.Nesting.SchoolMVC.Model;

import java.util.List;

public class StudyGroupService{


    public StudyGroup formGroup(Teacher t, List<Student> l){
        return new StudyGroup(l,t);
    }



}

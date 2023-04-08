package org.Seminar11.Nesting.SchoolMVC.Model.Service.Groups;

import org.Seminar11.Nesting.SchoolMVC.Model.Core.Student;
import org.Seminar11.Nesting.SchoolMVC.Model.Core.StudyGroup;
import org.Seminar11.Nesting.SchoolMVC.Model.Core.Teacher;

import java.util.List;

public class StudyGroupCreate<T extends Teacher,S extends Student> extends StudyGroupService implements CreatableGroup<T,S> {
    public StudyGroup<T,S> formGroup(T t, List<S> l){
        return new StudyGroup<T,S>(l,t);
    }
}

package org.Seminar11.Nesting.SchoolMVC.Model.Service.Groups;

import org.Seminar11.Nesting.SchoolMVC.Model.Core.Student;
import org.Seminar11.Nesting.SchoolMVC.Model.Core.StudyGroup;
import org.Seminar11.Nesting.SchoolMVC.Model.Core.Teacher;

import java.util.List;

public interface CreatableGroup<T extends Teacher,S extends Student> {
    public StudyGroup<T,S> formGroup(T t, List<S> l);
}

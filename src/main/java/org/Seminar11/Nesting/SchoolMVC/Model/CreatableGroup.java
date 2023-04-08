package org.Seminar11.Nesting.SchoolMVC.Model;

import java.util.List;

public interface CreatableGroup<T extends Teacher,S extends Student> {
    public StudyGroup<T,S> formGroup(T t, List<S> l);
}

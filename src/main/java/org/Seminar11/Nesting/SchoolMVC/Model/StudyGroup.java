package org.Seminar11.Nesting.SchoolMVC.Model;

import java.util.List;
// здесь немного страдает D принцип.
// В идеале, нужно завести отдельный абстракции на учителей и студентов , и делать обобщения в этом классе по "преподающим" и "учащимся классам".
// Но это нам реально понадобится,только когда в дереве User появится третий уровень разделения.
public class StudyGroup <T extends Teacher,S extends Student>{
    List<S> groupStudents;
    T groupTeacher;
    int groupID;
    static int groupCount;

    public StudyGroup(List<S> groupStudents, T groupTeacher) {
        this.groupStudents = groupStudents;
        this.groupTeacher = groupTeacher;
        int groupID = ++groupCount;
    }


    public List<S> getGroupStudents() {
        return groupStudents;
    }

    public T getGroupTeacher() {
        return groupTeacher;
    }

    public int getGroupID() {
        return groupID;
    }
}

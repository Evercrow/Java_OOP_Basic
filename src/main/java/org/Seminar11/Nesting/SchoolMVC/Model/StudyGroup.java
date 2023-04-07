package org.Seminar11.Nesting.SchoolMVC.Model;

import java.util.List;

public class StudyGroup {
    List<Student> groupStudents;
    Teacher groupTeacher;
    int groupID;
    static int groupCount;

    public StudyGroup(List<Student> groupStudents, Teacher groupTeacher) {
        this.groupStudents = groupStudents;
        this.groupTeacher = groupTeacher;
        int groupID = ++groupCount;
    }
}

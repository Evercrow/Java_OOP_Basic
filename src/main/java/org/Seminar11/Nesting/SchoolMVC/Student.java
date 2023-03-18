package org.Seminar11.Nesting.SchoolMVC;

import java.util.Date;
import java.util.List;

public class Student extends User{

    int groupID;
    List<Integer> grades;


    public Student(Date datebirth, String fio, int ID) {
        super(datebirth, fio, ID);
    }
    public Student(){
        super(new Date(), "студент"+ID, ID);
    }
}

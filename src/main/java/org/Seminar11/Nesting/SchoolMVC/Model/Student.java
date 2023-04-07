package org.Seminar11.Nesting.SchoolMVC.Model;

import java.util.Date;
import java.util.List;

public class Student extends User{

    int groupID;
    List<Integer> grades;


    public Student(Date datebirth, String fio) {
        super(datebirth, fio);
    }
    public Student(){
        super(new Date(), "студент"+countID);
    }

    @Override
    public String toString() {
        return String.format("id=%d,ФИО %s,дата рождения %s,учебная группа %d, оценки: ", ID, fio, datebirth, groupID) + grades.toString();
    }
}

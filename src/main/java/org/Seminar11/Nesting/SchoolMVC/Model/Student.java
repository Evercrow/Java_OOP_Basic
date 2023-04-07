package org.Seminar11.Nesting.SchoolMVC.Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student extends User{

    List<Integer> grades;


    public Student(Date datebirth, String fio) {
        super(datebirth, fio);
    }
    public Student(){
        super(new Date(), "студент"+countID);
        this.grades = new ArrayList<>();
    }

    @Override
    public String toString() {
        return String.format("id=%d,ФИО %s,дата рождения %s оценки: ", ID, fio, datebirth) + grades.toString();
    }
}
